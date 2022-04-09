import Entidad.ClienteEntidad;
import Entidad.PedidoEntidad;
import Entidad.ViandaEntidad;
import Interfaz.CajaInterfaz;
import Interfaz.SistemaPrincipalInterfaz;
import Interfaz.TableroInterfaz;
import Interfaz.VentasInterfaz;
import Logica.*;
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
        new CajaInterfaz();
    }
}
