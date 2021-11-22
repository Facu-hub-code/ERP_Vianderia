/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import Entidad.VentaEntidad;
import java.awt.HeadlessException;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Instant;
import javax.swing.JOptionPane;
/**
 *
 * @author facundolorenzo
 */
public class VentaBackEnd {
    
    public static void modificarVenta(VentaEntidad venta){
        Connection cn = Conexion.conectar();
        String sql = "UPDATE ventas SET "
                    + "cliente = ?, vianda = ?, unidades = ?, precio = ?, fecha = ? "
                + "WHERE id ='" + venta.getId() + "'"; //revisar que sea el de la fila
   
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(2, venta.getCliente());
            ps.setString(3, venta.getVianda());
            ps.setInt(4, venta.getId());
            ps.setDouble(5, venta.getPrecio());
            ps.setDate(6, (java.sql.Date) Date.from(Instant.now()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            cn.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        } 
    }

    public static void agregarVenta(VentaEntidad venta){
        Connection cn = Conexion.conectar();
        String strPS = "INSERT INTO ventas VALUES(?,?,?,?,?,?)"; //todo revisar cantidad de valores
        try {
            PreparedStatement ps = cn.prepareStatement(strPS);
            ps.setString(2, venta.getCliente());
            ps.setString(3, venta.getVianda());
            ps.setInt(4, venta.getUnidades());
            ps.setDouble(5, venta.getPrecio());
            ps.setString(5, venta.getFecha());
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public static void eliminarVenta(int id){
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM ventas where id =" + id; //todo: debuggear si este es el id
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
       
}
