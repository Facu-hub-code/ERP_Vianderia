import Entidad.ClienteEntidad;
import Interfaz.ClientesInterfaz;
import Logica.ClienteLogica;
import Logica.LoginLogica;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClientes {

    ClientesInterfaz clientesInterfaz;

    @BeforeAll
    public void setUp(){
        Assertions.assertTrue(LoginLogica.validarIngreso("root", "toor"));
        clientesInterfaz = new ClientesInterfaz();
    }

    @Test
    public void shouldAddClient(){
        clientesInterfaz.setNombre("agregar nombre");
        Assertions.assertTrue(clientesInterfaz.addCliente());
    }

    @Test
    public void shouldNotAddClient(){
        clientesInterfaz.setNombre("");
        Assertions.assertFalse(clientesInterfaz.addCliente());
    }

    @Test
    public void shouldUpdateClient(){
        clientesInterfaz.setNombre("actualizar nombre");
        clientesInterfaz.setIdVigente(10);
        Assertions.assertTrue(clientesInterfaz.addCliente());
    }

    @Test
    public void shouldNotUpdateClient(){
        clientesInterfaz.setNombre("");
        Assertions.assertFalse(clientesInterfaz.addCliente());
    }

}
