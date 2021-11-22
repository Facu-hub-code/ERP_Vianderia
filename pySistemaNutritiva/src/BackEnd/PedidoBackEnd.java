/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import Entidad.PedidoEntidad;
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
public class PedidoBackEnd {
    
    public static void modificarPedido(PedidoEntidad pedido){
        Connection cn = Conexion.conectar();
        String sql = "UPDATE pedidos SET "
                    + "cliente = ?, vianda = ?, unidades = ?, precio = ?, dias = ? "
                + "WHERE id ='" + pedido.getId() + "'"; //revisar que sea el de la fila
   
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(2, pedido.getCliente());
            ps.setString(3, pedido.getVianda());
            ps.setInt(4, pedido.getUnidades());
            ps.setDouble(5, pedido.getPrecio());
            ps.setString(6, pedido.getDias());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            cn.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        } 
    }
    
    public static void agregarPedido(PedidoEntidad pedido){
        Connection cn = Conexion.conectar();
        String strPS = "INSERT INTO pedidos VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(strPS);
            ps.setInt(1, 0);
            ps.setString(2, pedido.getCliente());
            ps.setString(3, pedido.getVianda());
            ps.setInt(4, pedido.getUnidades());
            ps.setFloat(5, pedido.getPrecio());
            ps.setString(6, pedido.getDias());
            JOptionPane.showMessageDialog(null, "Se agrego el pedido de: "+pedido.getCliente());
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public static void cancelarPedido(int id){
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM pedidos where id =" + id;
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
    
    public static DefaultTableModel actualizarTabla(String dia){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Cliente");
        tabla.addColumn("Vianda");
        tabla.addColumn("Unidades");
        tabla.addColumn("Precio");
        tabla.addColumn("Dias");
        String[] datos = new String[6];  
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM pedidos WHERE dias LIKE '%" + dia + "%'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos[0] = rs.getInt("id")+"";
                datos[1] = rs.getString("cliente");
                datos[2] = rs.getString("vianda"); 
                datos[3] = rs.getInt("unidades")+"";
                datos[4] = rs.getFloat("precio")+""; 
                datos[5] = rs.getString("dias");
                tabla.addRow(datos);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return tabla;
    }    
}
