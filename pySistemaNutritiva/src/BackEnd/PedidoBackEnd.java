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
                + "WHERE idpedido ='" + pedido.getId() + "'"; //revisar que sea el de la fila
   
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
        String strPS = "INSERT INTO pedidos VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(strPS);
            ps.setInt(1, 0);
            ps.setString(2, pedido.getCliente());
            ps.setString(3, pedido.getVianda());
            ps.setInt(4, pedido.getUnidades());
            ps.setFloat(5, pedido.getPrecio());
            ps.setString(6, pedido.getDias());
            ps.setString(7, pedido.getTipo().toString());
            JOptionPane.showMessageDialog(null, "Se agrego el pedido de: "+pedido.getCliente());
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public static void cancelarPedido(int id){
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM pedidos where idpedidos =" + id;
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
        Connection cn = Conexion.conectar();
        String[] titulos = {"ID", "Cliente", "Vianda", "Unidades", "Precio", "Dias", "Tipo"};
        String[] registros = new String[7];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM pedidos WHERE dias LIKE '%" + dia + "%'";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                registros[0] = rs.getInt("idpedido")+"";
                registros[1] = rs.getString("cliente");
                registros[2] = rs.getString("vianda");
                registros[3] = rs.getInt("unidades")+"";
                registros[4] = rs.getFloat("precio")+"";
                registros[5] = rs.getString("dias");
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
}
