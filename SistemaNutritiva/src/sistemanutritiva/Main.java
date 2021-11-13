/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanutritiva;

import Interface.GestionClientes;
import Interface.LoginJF;
import Interface.SistemaPrincipal;

/**
 *
 * @author facul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LoginJF login = new LoginJF();
        //login.setVisible(true);
        //SistemaPrincipal sistemaPrincipal = new SistemaPrincipal();
        //sistemaPrincipal.setVisible(true);
        GestionClientes gestionClientes = new GestionClientes();
        gestionClientes.setVisible(true);
    }
    
}
