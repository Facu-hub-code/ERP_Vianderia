/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Conexion.Conexion;
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
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private long telefono;

    public Cliente(String nombre, String apellido, int dni, String direccion, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente() {
    }
    
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
        Connection cn = Conexion.conectar();
        String strPS = "INSERT INTO clientes VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(strPS);
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getDni());
            ps.setString(5, cliente.getDireccion());
            ps.setLong(6, cliente.getTelefono());
            JOptionPane.showMessageDialog(null, "Cliente "+cliente.getNombre()+" agregado correctamente");
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public static DefaultTableModel actualizarTabla(DefaultTableModel tabla){
        String[] datos = new String[5];  
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * from clientes");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(2); //tomo el nombre
                datos[1] = rs.getString(3); //tomo el apellido
                datos[2] = rs.getInt(4)+""; //tomo el telefono
                datos[3] = rs.getString(5); //tomo el direccion
                datos[4] = rs.getString(6); //tomo el dni
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
