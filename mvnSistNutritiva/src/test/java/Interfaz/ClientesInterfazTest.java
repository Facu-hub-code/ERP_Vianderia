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

    @Test
    public void shouldUpdateCorrectly(){
        clientesInterfaz.setIdVigente(3);
        clientesInterfaz.setNombre("nombre valido");
        Assertions.assertTrue(clientesInterfaz.updateCliente());
    }

    @Test
    public void shouldUpdateInCorrectlyById(){
        clientesInterfaz.setIdVigente(-1);
        Assertions.assertFalse(clientesInterfaz.updateCliente());
    }

    @Test
    public void shouldUpdateInCorrectlyByName(){
        clientesInterfaz.setNombre("");
        Assertions.assertFalse(clientesInterfaz.updateCliente());
    }


}