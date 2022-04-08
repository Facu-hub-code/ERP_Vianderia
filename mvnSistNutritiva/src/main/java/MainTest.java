import Entidad.ClienteEntidad;
import Entidad.PedidoEntidad;
import Entidad.ViandaEntidad;
import Interfaz.TableroInterfaz;
import Logica.ClienteLogica;
import Logica.LoginLogica;
import Logica.PedidoLogica;
import Logica.ViandasLogica;
import Repository.PedidoRepository;

import java.sql.Date;

public class MainTest {
    public static void main(String[] args) {
        LoginLogica.validarIngreso("root", "toor");
        ViandaEntidad vianda = new ViandaEntidad("Vianda ejemplo", 200);
        ViandasLogica.addVianda(vianda);
        ClienteEntidad cliente = new ClienteEntidad("Facundo", "Lorenzo", "41411627",
               "faculoren7@gmail.com", "3585098671", "Hipolito Yrigoyen 485");
        ClienteLogica.addClient(cliente);
        PedidoEntidad lunes = new PedidoEntidad(cliente, vianda, Date.valueOf("2022-04-11"), "CENA");
//    PedidoEntidad martes = new PedidoEntidad(cliente, vianda, Date.valueOf("2022-04-12"), "CENA");
//    PedidoEntidad miercolesCarne = new PedidoEntidad(cliente, vianda, Date.valueOf("2022-04-13"), "CENACARNE");
//    PedidoEntidad miercolesPescado = new PedidoEntidad(cliente, vianda, Date.valueOf("2022-04-13"), "CENAPESCADO");
//    PedidoEntidad jueves = new PedidoEntidad(cliente, vianda, Date.valueOf("2022-04-14"), "CENA");
//    PedidoEntidad viernes = new PedidoEntidad(cliente, vianda, Date.valueOf("2022-04-15"), "CENA");
        PedidoLogica.addPedido(lunes);
//    PedidoLogica.addPedido(martes);
//    PedidoLogica.addPedido(miercolesCarne);
//    PedidoLogica.addPedido(miercolesPescado);
//    PedidoLogica.addPedido(jueves);
//    PedidoLogica.addPedido(viernes);
        new TableroInterfaz();
    }
}
