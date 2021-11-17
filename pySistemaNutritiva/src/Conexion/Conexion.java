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
<<<<<<< Updated upstream:pySistemaNutritiva/src/Conexion/Conexion.java
        String sql = "jdbc:mysql://localhost:3306/sakila";
        try {
            Connection conn = DriverManager.getConnection(sql, "root", "toor");
            return conn;
=======
        Connection cn = null;
        try {
            cn = DriverManager.getConnection("jdbc:mysql://﻿localhost/bdd_sistema_nutritiva", "root", "");
>>>>>>> Stashed changes:SistemaNutritiva/src/Conexion/Conexion.java
        } catch (SQLException e) {
            System.out.println("Error: "+e.getErrorCode()+" "+e.getMessage());
        }
        return cn;
    }
}
