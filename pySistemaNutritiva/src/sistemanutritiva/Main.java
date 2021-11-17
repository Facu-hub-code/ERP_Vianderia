/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanutritiva;

import FrontEnd.LoginJF;
import Conexion.Conexion;
/**
 *
 * @author facul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion.conectar();
        //LoginJF login = new LoginJF();
        //login.setVisible(true);
    }
    
}
