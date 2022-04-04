import Entidad.ClienteEntidad;
import Interfaz.*;
import Logica.LoginLogica;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class Main {
//    public static void main(String[] args) {
//        new LoginInterfaz();
//    }
public static void main(String[] args) {
    LoginLogica.validarIngreso("root", "toor");
    new SistemaPrincipalInterfaz();
    //new ClientesInterfaz();
    //new ViandasInterfaz();
    new PedidosInterfaz();
}
}
