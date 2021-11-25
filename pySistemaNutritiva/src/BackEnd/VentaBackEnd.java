/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import Entidad.VentaEntidad;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author facundolorenzo
 */
public class VentaBackEnd {
    
    public static DefaultTableModel actualizarTable(){
        Connection cn = Conexion.conectar();
        
        String[] titulos = {"ID", "Cliente", "Vianda" ,"Unidades", "Precio", "Fecha", "Tipo"};
        DefaultTableModel model = new DefaultTableModel(); //haces una tabla
        for (String titulo : titulos) //le pones los titulos
            model.addColumn(titulo);                    
        
        String[] registros = new String[7];
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
                registros[6] = rs.getString("tipo");
                model.addRow(registros);
            }           
            cn.close();
            return model;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
    
    public static boolean modificarVenta(VentaEntidad venta){
        Connection cn = Conexion.conectar();
        String sql = "UPDATE ventas SET "
                    + "cliente = ?, vianda = ?, unidades = ?, precio = ?, fecha = ?, tipo = ?"
                + "WHERE idventa ='" + venta.getId() + "'"; 
   
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, venta.getCliente());
            ps.setString(2, venta.getVianda());
            ps.setInt(3, venta.getUnidades());
            ps.setDouble(4, venta.getPrecio());
            ps.setString(5,venta.getFecha());
            ps.setString(6, venta.getTipo().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            cn.close();
            return true;
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        } 
        return false;
    }

    public static boolean agregarVenta(VentaEntidad venta){
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO ventas VALUES(?,?,?,?,?,?,?)"); 
            ps.setInt(1, 0); //todo cambiar
            ps.setString(2, venta.getCliente());
            ps.setString(3, venta.getVianda());
            ps.setInt(4, venta.getUnidades());
            ps.setDouble(5, venta.getPrecio());
            ps.setString(6, venta.getFecha());
            ps.setString(7, venta.getTipo().toString());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Venta exitosa...");
            cn.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return false;
    }
    
    public static boolean eliminarVenta(int id){
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM ventas where idventa =" + id;
            PreparedStatement ps = cn.prepareStatement(sql);
            int filasAfectadas = ps.executeUpdate();
            cn.close();
            return filasAfectadas >= 0;
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        }
        return false; //para que compile
    }
       
}
