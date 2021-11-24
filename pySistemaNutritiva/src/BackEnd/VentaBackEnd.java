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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author facundolorenzo
 */
public class VentaBackEnd {
    
    public static DefaultTableModel actualizarTable(){
        Connection cn = Conexion.conectar();
        
        String[] titulos = {"ID", "Cliente", "Vianda" ,"Unidades", "Precio", "Fecha", "Dia", "Tipo"};
        DefaultTableModel model = new DefaultTableModel(); //haces una tabla
        for (String titulo : titulos) //le pones los titulos
            model.addColumn(titulo);                    
        
        String[] registros = new String[8];        
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM ventas");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){           
                registros[0] = rs.getInt("idventa")+"";
                registros[1] = rs.getString("cliente");
                registros[2] = rs.getString("vianda");
                registros[3] = rs.getInt("unidades")+"";
                registros[4] = rs.getFloat("precio")+"";
                registros[5] = rs.getDate("fecha").toString();
                registros[6] = rs.getString("dia");
                registros[7] = rs.getString("tipo");
                model.addRow(registros);
            }           
            cn.close();
            return model;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
    
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
