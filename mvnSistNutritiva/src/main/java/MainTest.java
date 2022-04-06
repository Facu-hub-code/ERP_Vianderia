import Entidad.ClienteEntidad;
import Entidad.PedidoEntidad;
import Entidad.ViandaEntidad;
import Interfaz.TableroInterfaz;
import Logica.ClienteLogica;
import Logica.LoginLogica;
import Logica.PedidoLogica;
import Logica.ViandasLogica;

import java.sql.Date;

public class MainTest {
//    public static void main(String[] args) {
//        new LoginInterfaz();
//    }
public static void main(String[] args) {
    LoginLogica.validarIngreso("root", "Facu4813");
    //new SistemaPrincipalInterfaz();
    //new ClientesInterfaz();
    //new ViandasInterfaz();
    //new PedidosInterfaz();
    ViandaEntidad vianda = new ViandaEntidad("Vianda ejemplo", 200);
    ViandasLogica.addVianda(vianda);
    ClienteEntidad cliente = new ClienteEntidad("Facundo", "Lorenzo", "41411627",
            "faculoren7@gmail.com", "3585098671", "Hipolito Yrigoyen 485");
    ClienteLogica.addClient(cliente);
    PedidoEntidad pedidoEntidad = new PedidoEntidad(cliente, vianda, Date.valueOf("2022-10-10"), "ALMUERZO");
    PedidoLogica.addPedido(pedidoEntidad);
    new TableroInterfaz();
}
}
