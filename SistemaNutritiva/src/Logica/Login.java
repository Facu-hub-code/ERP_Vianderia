/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Conexion.Conexion;
import Interface.SistemaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author facul
 */
public class Login {
       
    private static String user;
    private static String password;
    
    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public boolean validar(){
        boolean flag = false;
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM usuarios"
                    + " WHERE user = '" + user + "' AND password = '" + password + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                flag = true;                
            }else{
            } 
        }catch (SQLException e) {}//El catch no hace nada, solo sigue el programa
        return flag;
    }
}
