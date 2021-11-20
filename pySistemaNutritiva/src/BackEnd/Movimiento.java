/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facul
 */
public class Movimiento {
    private float monto;
    private String especificacion;
    private boolean ingreso;
    private boolean efectivo;
    private String fecha;

    public Movimiento(float monto, String especificacion, String fecha, boolean ingreso, boolean efectivo) {
        this.monto = monto;
        this.especificacion = especificacion;
        this.fecha = fecha;
        this.ingreso = ingreso;
        this.efectivo = efectivo;
    }
    
    //Metodo para calcular el dinero total del negocio
    public static Double calcularTotal(){
        double total = 0;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * from movimientos");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if ( rs.getBoolean("ingreso") ) //todo: revisar index = 3
                    total += rs.getDouble("monto");
                else
                    total -= rs.getDouble("monto");
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return total;
    }
    
    //Metodo para calcular el dinero en efectivo del negocio
    public static Double calcularEfectivo(){
        double efectivo = 0;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * from movimientos");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getBoolean("efectivo")) {
                    if ( rs.getBoolean("efectivo") )
                        efectivo += rs.getDouble("monto");
                    else
                        efectivo -= rs.getDouble("monto");
                }
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return efectivo;
    }
    
    //Metodo que actualiza los valores de la tabla interface
    public static DefaultTableModel actualizarTabla(DefaultTableModel tabla){
        String[] datos = new String[6];  
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * from movimientos");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos[0] = rs.getInt("idmovimientos")+"";
                datos[1] = rs.getDouble("monto")+""; //tomo el monto
                datos[2] = rs.getString("especificacion"); //tomo la especificacion
                if(rs.getBoolean("ingreso")) //si es ingreso
                    datos[3] = "Ingreso";
                else
                    datos[3] = "Egreso";
                if (rs.getBoolean("efectivo")) //si es efectivo
                    datos[4] = "Efectivo";
                else 
                    datos[4] = "Otro";
                datos[5] = rs.getDate("fecha").toString();
 
                tabla.addRow(datos);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return tabla;
    }
    
    //Metodo para modificar un movimiento de la tabla
    public static void modificarMovimiento(Movimiento movimiento, int id){
        Connection cn = Conexion.conectar();
        String sql = "UPDATE movimientos SET "
                    + "monto = ?, especificacion = ?, ingreso = ?, efectivo = ?, fecha = ? "
                + "WHERE idmovimientos ='" + id + "'"; //revisar que sea el de la fila
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setDouble(1, movimiento.getMonto());
            ps.setString(2, movimiento.getEspecificacion());
            ps.setBoolean(3, movimiento.isIngreso());
            ps.setBoolean(4, movimiento.isEfectivo());
            ps.setString(5,movimiento.getFecha());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            cn.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        }   
    }
    
    //Metodo para elimianr un movimiento de la base de datos
    public static void eliminarMovimiento(int id){ //no se usa el movimiento, con algun identificador es suficiente
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM movimientos where idmovimientos ="+id;
            PreparedStatement ps = cn.prepareStatement(sql);
            if(ps.executeUpdate() >= 0 ){
                JOptionPane.showMessageDialog(null, "Se elimino correctamente.");
            }else{
                JOptionPane.showMessageDialog(null, "Error al intentar eliminar dicho movimiento");
            }
            cn.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public static void agregarMovimiento(Movimiento movimiento){
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO movimientos VALUES (?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setFloat(2, movimiento.getMonto());
            ps.setString(3, movimiento.getEspecificacion());
            ps.setBoolean(4, movimiento.isIngreso());
            ps.setBoolean(5, movimiento.isEfectivo());
            ps.setString(6, movimiento.getFecha());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se agrego el movimiento exitosamente");
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public boolean isIngreso() {
        return ingreso;
    }

    public void setIngreso(boolean ingreso) {
        this.ingreso = ingreso;
    }

    public boolean isEfectivo() {
        return efectivo;
    }

    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
