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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facul
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private long telefono;

    public Cliente(String nombre, String apellido, int dni, String direccion, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        if(dni == 0)
            dni = 0;
        else
            this.dni = dni;
        
        
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente() {
    }
    
    //Metodo que chequea que ningun campo de texto este vacio.
    
    //Metodo que modifica un cliente de la base de datos
    public static void modificarCliente(Cliente cliente){
        Connection cn = Conexion.conectar();
        String sql = "UPDATE clientes SET "
                    + "nombre = ?, apellido = ?, dni = ?, direccion = ?, telefono = ? "
                + "WHERE dni ='" + cliente.getDni() + "'";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getDni());
            ps.setString(4, cliente.getDireccion());
            ps.setLong(5, cliente.getTelefono());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            cn.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }        
    }
    
    //Metodo que elimina un cliente de la base de datos
    public static void eliminarCliente(int id){
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM clientes where id ="+id;
            PreparedStatement ps = cn.prepareStatement(sql);
            if(ps.executeUpdate() >= 0 ){
                JOptionPane.showMessageDialog(null, "Se elimino el cliente correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el cliente a eliminar");
            }
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    //Metodo que agrega un cliente a la base de datos
    public static void agregarCliente(Cliente cliente){
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
            int filasAfectadas = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se agrego el cliente: "+cliente.getNombre()
            +" " +cliente.getApellido());
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    /*
    Filtra el apelldio de la busqueda sobre un campo de texto, para agilizarla.
    */
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
    
    /**
     * Filtra el nombre de la busqueda sobre un campo de texto, para agilizarla.
     */
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
    
    public static DefaultTableModel actualizarTabla(DefaultTableModel tabla){
        String[] datos = new String[5];  
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * from clientes");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("apellido");
                datos[2] = rs.getInt("dni")+""; 
                datos[3] = rs.getString("direccion");
                datos[4] = rs.getString("telefono"); 
                tabla.addRow(datos);
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return tabla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
}
