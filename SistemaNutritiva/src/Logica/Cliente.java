/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Conexion.Conexion;
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
    
    public DefaultTableModel actualizarTable(DefaultTableModel modelo){
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
                modelo.addRow(datos);
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return modelo;
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
