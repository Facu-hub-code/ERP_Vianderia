/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

//Imports
import Entidad.ClienteEntidad;
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
public class ClienteBackEnd {
    
    public static boolean modificarCliente(ClienteEntidad cliente, int id){
        Connection cn = Conexion.conectar();
        String sql = "UPDATE clientes SET "+ "nombre = ?, apellido = ?, dni = ?,"
                + " direccion = ?, telefono = ? "+ "WHERE idcliente ='" + id + "'";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getDni());
            ps.setString(4, cliente.getDireccion());
            ps.setLong(5, cliente.getTelefono());
            ps.executeUpdate();
            cn.close();
            return true;
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }        
        return false;
    }
    
    public static boolean eliminarCliente(int id){
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("DELETE FROM clientes where idcliente ="+id);
            int filasAfectadas = ps.executeUpdate();
            cn.close();
            
            return filasAfectadas >= 0;                       
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        }
        return false; //para que compile
    }
    
    public static boolean agregarCliente(ClienteEntidad cliente){
        //Establecer la conexion.
        Connection cn = Conexion.conectar();
        try {    
            //Creamos el statement del tipo PreparedStatement(precompilado).
            PreparedStatement ps = cn.prepareStatement("INSERT INTO clientes VALUES (?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getDni());
            ps.setString(5, cliente.getDireccion());
            ps.setLong(6, cliente.getTelefono());
            ps.executeUpdate();
            cn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public static DefaultTableModel filtrarApellido(String valor) {
        Connection conn = Conexion.conectar();
        String[] titulos = {"Nombre", "Apellido", "DNI", "Direccion", "Telefono"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM clientes WHERE apellido LIKE '%" + valor + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("nombre");
                registros[1] = rs.getString("apellido");
                registros[2] = rs.getInt("dni")+"";
                registros[3] = rs.getString("direccion");
                registros[4] = rs.getLong("telefono")+"";
                model.addRow(registros);
            }
            conn.close();
            return model;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getErrorCode() + e.getMessage());
        }
        return (null);
    }
    
    public static DefaultTableModel filtrarNombre(String valor) {
        Connection conn = Conexion.conectar();
        String[] titulos = {"Nombre", "Apellido", "DNI", "Direccion", "Telefono"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM clientes WHERE nombre LIKE '%" + valor + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("nombre");
                registros[1] = rs.getString("apellido");
                registros[2] = rs.getInt("dni")+"";
                registros[3] = rs.getString("direccion");
                registros[4] = rs.getLong("telefono")+"";
                model.addRow(registros);
            }
            conn.close();
            return model;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getErrorCode() + e.getMessage());
        }
        return (null);
    }
    
    public static DefaultTableModel actualizarTabla(){
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"ID", "Nombre", "Apellido", "DNI", "Direccion", "Telefono" };
        for(String titulo: titulos)
            tabla.addColumn(titulo);

        String[] datos = new String[6];  
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * from clientes");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos[0] = rs.getInt("idcliente")+"";
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellido");
                datos[3] = rs.getInt("dni")+""; 
                datos[4] = rs.getString("direccion");
                datos[5] = rs.getString("telefono"); 
                tabla.addRow(datos);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return tabla;
    }    
}
