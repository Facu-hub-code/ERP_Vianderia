import Entidad.*;
import Interfaz.*;
import Logica.*;
import Repository.PedidoRepository;

import java.sql.Date;
import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        LoginLogica.validarIngreso("root", "toor");

        new ViandasInterfaz();
    }
}
