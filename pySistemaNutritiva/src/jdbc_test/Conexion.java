/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author facul
 */
public class Conexion {

    public static Connection conectar(){
        String sql = "jdbc:mysql://localhost:3306/sakila";
        try {
            Connection conn = DriverManager.getConnection(sql, "root", "toor");
            System.out.println("Conexion exitosa");
            return conn;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (null);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        try {
            PreparedStatement stmt = conectar().prepareStatement("SELECT first_name, last_name FROM actor WHERE actor_id = 1;");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getNString("first_name"));
                System.out.println(rs.getString("last_name"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getErrorCode() + " " + e.getMessage());
        }
        
    }
    
}
