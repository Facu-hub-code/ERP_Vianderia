/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author facul
 */
public class Conexion {
    public static Connection conectar(){
        String sql = "jdbc:mysql://localhost:3306/nutritiva";
        try {
            Connection conn = DriverManager.getConnection(sql, "root", "toor");
            System.out.println("Conexion exitosa");
            return conn;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (null);
    }
    
    
}
