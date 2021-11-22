/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import Entidad.ViandaEntidad;
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
public class ViandaBackEnd {

    public static DefaultTableModel actualizarTabla() {
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Precio");
        tabla.addColumn("Dias");
        String[] datos = new String[4];
        Connection cn = Conexion.conectar(); //Establezco conexion
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * from viandas"); //Creo el statement del tipo PreparedStatement(Precompilado).
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {   //Analizo el Objeto tabla ResultSet.
                datos[0] = rs.getInt("idviandas") + "";
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getDouble("precio") + "";
                datos[3] = rs.getString("dias");
                tabla.addRow(datos);
            }
            cn.close(); //Cierro la comunicacion
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return tabla;
    }

    public static DefaultTableModel filtrarNombre(String valor) {
        Connection conn = Conexion.conectar();
        String[] titulos = {"Nombre", "Precio", "Dias"};
        String[] registros = new String[3];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM viandas WHERE nombre LIKE '%" + valor + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("nombre");
                registros[1] = rs.getFloat("precio") + "";
                registros[2] = rs.getString("dias");
                model.addRow(registros);
            }
            conn.close();
            return model;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getErrorCode() + e.getMessage());
        }
        return (null);
    }

    public static void modificarVianda(ViandaEntidad vianda, int id) {
        Connection cn = Conexion.conectar();
        String sql = "UPDATE viandas SET "
                + "nombre = ?, precio = ?, dias = ?"
                + "WHERE idviandas ='" + id + "'";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, vianda.getNombre());
            ps.setFloat(2, vianda.getPrecio());
            ps.setString(3, vianda.getDias());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            cn.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        }
    }

    public static void eliminarVianda(int id) {
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM viandas where idviandas =" + id;
            PreparedStatement ps = cn.prepareStatement(sql);
            if (ps.executeUpdate() >= 0) {
                JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la vianada");
            }
            cn.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        }
    }

    public static void agregarVianda(ViandaEntidad vianda) {
        Connection cn = Conexion.conectar();
        try {
            //Creamos el statement del tipo PreparedStatement(precompilado).
            PreparedStatement ps = cn.prepareStatement("INSERT INTO viandas VALUES (?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, vianda.getNombre());
            ps.setFloat(3, vianda.getPrecio());
            ps.setString(4, vianda.getDias());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se agrego la vianda: " + vianda.getNombre());
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
