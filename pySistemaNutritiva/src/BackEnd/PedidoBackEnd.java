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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facul
 */
public class PedidoBackEnd {
    
    public static boolean modificarPedido(PedidoEntidad pedido){
        Connection cn = Conexion.conectar();
        String sql = "UPDATE pedidos SET "
                    + "cliente = ?, vianda = ?, unidades = ?, precio = ?, dias = ? , tipo = ? "
                + "WHERE idpedido ='" + pedido.getId() + "'"; //revisar que sea el de la fila
   
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, pedido.getCliente());
            ps.setString(2, pedido.getVianda());
            ps.setInt(3, pedido.getUnidades());
            ps.setDouble(4, pedido.getPrecio());
            ps.setString(5, pedido.getDias().toString());
            ps.setString(6, pedido.getTipo().toString());
            ps.executeUpdate();
            cn.close();
            return true;
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        } 
        return false;
    }
    
    public static boolean agregarPedido(PedidoEntidad pedido){
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO pedidos VALUES(?,?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, pedido.getCliente());
            ps.setString(3, pedido.getVianda());
            ps.setInt(4, pedido.getUnidades());
            ps.setFloat(5, pedido.getPrecio());
            ps.setString(6, pedido.getDias().toString());
            ps.setString(7, pedido.getTipo().toString());
            ps.execute();
            cn.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return false;
    }
    
    public static boolean eliminarPedido(int id){
        boolean flagPedido = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM pedidos where idpedido =" + id;
            PreparedStatement ps = cn.prepareStatement(sql);
            if(ps.executeUpdate() >= 0 )
                flagPedido = true;
            cn.close();
            
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        }
        return flagPedido;
    }
    
    public static DefaultTableModel actualizarTable(){
        Connection cn = Conexion.conectar();
        String[] registros = new String[7];
        String[] titulos = {"ID", "Cliente", "Vianda" ,"Unidades", "Precio", "Dias", "Tipo"};
        DefaultTableModel model = new DefaultTableModel();
        
        for (String titulo : titulos)
            model.addColumn(titulo);                    
                
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM pedidos");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){           
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
    
    public static DefaultTableModel actualizarTablas(String dia){
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
    
    public static float getPrecioVianda(String nombreVianda){
        Connection cn = Conexion.conectar();
        try {                        
            PreparedStatement ps = cn.prepareStatement("SELECT precio FROM viandas "
                    + "WHERE nombre = '"+nombreVianda+"'");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getFloat("precio");                
            }
                
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return 0;
    }
}
