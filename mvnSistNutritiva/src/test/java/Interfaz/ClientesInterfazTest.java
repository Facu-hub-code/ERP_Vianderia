package Interfaz;

import Entidad.ClienteEntidad;
import Logica.LoginLogica;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ClientesInterfazTest {

    ClientesInterfaz clientesInterfaz;

    @BeforeAll
    public static void setUpHibernate(){
        LoginLogica.validarIngreso("root","toor");
    }

    @BeforeEach
    private void setUp(){
        clientesInterfaz = new ClientesInterfaz();
        clientesInterfaz.setVisible(false);
    }

    @Test
    public void shouldAddCorrectly(){
        clientesInterfaz.setNombre("nombre valido");
        Assertions.assertTrue(clientesInterfaz.addCliente());
    }

    @Test
    public void shouldAddIncorrectly(){
        clientesInterfaz.setNombre("");
        Assertions.assertFalse(clientesInterfaz.addCliente());
    }
}