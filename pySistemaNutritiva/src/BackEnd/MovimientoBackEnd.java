/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import Entidad.MovimientoEntidad;
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
public class MovimientoBackEnd {
    
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
            System.out.println(e.toString());
        }
        return total;
    }
    
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
            System.out.println(e.toString());        }
        return efectivo;
    }
    
    public static DefaultTableModel actualizarTabla(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Monto");
        tabla.addColumn("Especificacion");
        tabla.addColumn("Ingreso/Egreso");
        tabla.addColumn("Efectivo/Banco");
        tabla.addColumn("Fecha");
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
    public static void modificarMovimiento(MovimientoEntidad movimiento, int id){
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
    
    public static void agregarMovimiento(MovimientoEntidad movimiento){
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
}