import Entidad.*;
import Interfaz.CajaInterfaz;
import Interfaz.SistemaPrincipalInterfaz;
import Interfaz.TableroInterfaz;
import Interfaz.VentasInterfaz;
import Logica.*;
import Repository.PedidoRepository;

import java.sql.Date;
import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        LoginLogica.validarIngreso("root", "toor");
        ViandasLogica.addVianda(new ViandaEntidad("Vianda ejemplo", 200));
        ClienteLogica.addClient(new ClienteEntidad("Facundo", "Lorenzo", "41411627",
                "faculoren7@gmail.com", "3585098671", "Hipolito Yrigoyen 485"));
        PedidoLogica.addPedido(new PedidoEntidad(ClienteLogica.getClientes().get(0), ViandasLogica.getViandas().get(0),
                Date.valueOf(LocalDate.now()), "ALMUERZO"));
        CajaLogica.addMovimiento(new MovimientoEntidad(200, "venta", Date.valueOf(LocalDate.now()), true));
        VentasLogica.addVenta(new VentaEntidad(Date.valueOf(LocalDate.now()), PedidoLogica.getPedidos().get(0),
                CajaLogica.getMovimientos().get(0)));

        new CajaInterfaz();
    }
}
