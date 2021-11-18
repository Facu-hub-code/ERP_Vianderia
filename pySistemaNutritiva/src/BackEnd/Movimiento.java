/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import BackEnd.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facul
 */
public class Movimiento {
    private double monto;
    private String especificacion;
    private boolean ingreso;
    private boolean efectivo;
    private Date fecha;

    public Movimiento(double monto, String especificacion, boolean ingreso, boolean efectivo, Date fechaDate) {
        this.monto = monto;
        this.especificacion = especificacion;
        this.ingreso = ingreso;
        this.efectivo = efectivo;
        this.fecha = fecha;
    }

    public Movimiento() {
    }
    
    //Metodo para calcular el dinero total del negocio
    public static Double calcularTotal(){
        double total = 0;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * from caja");
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
            PreparedStatement ps = cn.prepareStatement("SELECT * from caja");
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
        String[] datos = new String[5];  
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * from caja");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos[0] = rs.getDouble("monto")+""; //tomo el monto
                datos[1] = rs.getString("especificacion"); //tomo la especificacion
                if(rs.getBoolean("ingreso")) //tomo si es ingreso
                    datos[2] = "Ingreso";
                else
                    datos[2] = "Egreso";
                
                if (rs.getBoolean("efectivo")) //tomo si es efectivo
                    datos[3] = "Efectivo";
                else 
                    datos[3] = "Cuenta Banco";
                datos[4] = rs.getDate("fecha").toString();
                
                tabla.addRow(datos);
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return tabla;
    }
    
    //Metodo para modificar un movimiento de la tabla
    public static void modificarMovimiento(Movimiento movimiento, int id){
        Connection cn = Conexion.conectar();
        String sql = "UPDATE caja SET "
                    + "monto = ?, especificacion = ?, ingreso = ?, efectivo = ?, fecha = ? "
                + "WHERE id ='" + id + "'"; //revisar que sea el de la fila
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setDouble(1, movimiento.getMonto());
            ps.setString(2, movimiento.getEspecificacion());
            ps.setBoolean(3, movimiento.isIngreso());
            ps.setBoolean(4, movimiento.isEfectivo());
            ps.setDate(5, (java.sql.Date) movimiento.getFecha());//todo: cuidado con el sql vs java
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            cn.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }   
    }
    
    //Metodo para elimianr un movimiento de la base de datos
    public static void eliminarMovimiento(int fila){ //no se usa el movimiento, con algun identificador es suficiente
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM caja where id ="+fila; //todo: debuggear si este es el id
            PreparedStatement ps = cn.prepareStatement(sql);
            if(ps.executeUpdate() >= 0 ){
                JOptionPane.showMessageDialog(null, "Se elimino correctamente.");
            }else{
                JOptionPane.showMessageDialog(null, "Error al intentar eliminar dicho movimiento");
            }
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public static void agregarMovimiento(Movimiento movimiento){
        Connection cn = Conexion.conectar();
        String strPS = "INSERT INTO caja VALUES(?,?,?,?,?)"; //todo revisar cantidad de valores
        try {
            PreparedStatement ps = cn.prepareStatement(strPS);
            ps.setDouble(2, movimiento.getMonto());
            ps.setString(3, movimiento.getEspecificacion());
            ps.setBoolean(4, movimiento.isIngreso());
            ps.setBoolean(5, movimiento.isEfectivo());
            ps.setDate(6, (java.sql.Date) movimiento.getFecha());
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
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
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
