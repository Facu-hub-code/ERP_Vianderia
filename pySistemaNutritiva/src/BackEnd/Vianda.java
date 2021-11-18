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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facul
 */
public class Vianda {
    private String nombre;
    private double precio;
    private String dias;//Arreglo que indica que indica los dias

    public Vianda() {
    }

    public Vianda(String nombre, double precio, String dias) {
        this.nombre = nombre;
        this.precio = precio;
        this.dias = dias;
    }

    public static DefaultTableModel actualizarTabla(DefaultTableModel tabla){
        String[] datos = new String[5];  
        Connection cn = Conexion.conectar();
        try { //todo revisar
            PreparedStatement ps = cn.prepareStatement("SELECT * from viandas");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(2); //tomo el nombre
                datos[1] = rs.getDouble(3)+""; //tomo el precio
                datos[2] = rs.getString(4); //tomo los dias
                tabla.addRow(datos);
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return tabla;
    }
    
    public static void modificarVianda(Vianda vianda){
        Connection cn = Conexion.conectar();
        String sql = "UPDATE viandas SET "
                    + "nombre = ?, precio = ?, dias = ? "
                + "WHERE nombre ='" + vianda.getNombre() + "'";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, vianda.getNombre());
            ps.setDouble(2, vianda.getPrecio());
            ps.setString(3, vianda.getDias().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            cn.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }   
    }
    
    public static void eliminarViandaa(String nombre){
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM viandas where nombre ="+nombre;
            PreparedStatement ps = cn.prepareStatement(sql);
            if(ps.executeUpdate() >= 0 ){
                JOptionPane.showMessageDialog(null, "Se elimino la vianda: "+nombre);
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la vianda a eliminar");
            }
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public static void agregarVianda(Vianda vianda){
        Connection cn = Conexion.conectar();
        String strPS = "INSERT INTO viandas VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(strPS);
            ps.setString(2, vianda.getNombre());
            ps.setDouble(3, vianda.getPrecio());
            ps.setString(4, vianda.getDias());
            
            JOptionPane.showMessageDialog(null, "Vianda agregada correctamente");
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
    
    
    
}
