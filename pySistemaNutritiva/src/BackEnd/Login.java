/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author facul
 */
public class Login {
    
    public static boolean validar(String user, String password){
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
