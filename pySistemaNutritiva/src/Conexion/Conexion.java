/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
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
            return conn;
        } catch (SQLException e) {
            System.out.println("Error: "+e.getErrorCode()+" "+e.getMessage());
        }
        return (null);
    }
}
