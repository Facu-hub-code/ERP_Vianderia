/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Conexion.Conexion;
import java.awt.HeadlessException;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import javax.swing.JOptionPane;
/**
 *
 * @author facundolorenzo
 */
public class Venta {
    private String cliente;
    private String vianda;
    private int unidades;
    private double precio;
    private Date fecha;
    private int id;

    public Venta(String cliente, String vianda, int unidades, double precio, Date fecha, int id) {
        this.cliente = cliente;
        this.vianda = vianda;
        this.unidades = unidades;
        this.precio = precio;
        this.fecha = fecha;
        this.id = id;
    }
    
    public static void modificarVenta(Venta venta){
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
            JOptionPane.showMessageDialog(null, e.toString());
        } 
    }

    public static void agregarVenta(Venta venta){
        Connection cn = Conexion.conectar();
        String strPS = "INSERT INTO ventas VALUES(?,?,?,?,?,?)"; //todo revisar cantidad de valores
        try {
            PreparedStatement ps = cn.prepareStatement(strPS);
            ps.setString(2, venta.getCliente());
            ps.setString(3, venta.getVianda());
            ps.setInt(4, venta.getUnidades());
            ps.setDouble(5, venta.getPrecio());
            ps.setDate(6, (java.sql.Date) venta.getFecha());
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVianda() {
        return vianda;
    }

    public void setVianda(String vianda) {
        this.vianda = vianda;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
