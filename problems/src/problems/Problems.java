/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author facul
 */
public class Problems {

    public static Connection conectar(){
        Connection cn = null;
        try {
<<<<<<< Updated upstream:problems/src/problems/Problems.java
            cn = DriverManager.getConnection("jdbc:mysql://﻿localhost:3306/bdd_sistema_nutritiva", "root", "");
=======
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bdd_sistema_nutritiva", "root", "");
>>>>>>> Stashed changes:SistemaNutritiva/src/Conexion/Conexion.java
            return cn;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problems.conectar();
    }
    
}
