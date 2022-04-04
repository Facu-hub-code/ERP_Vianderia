import Interfaz.LoginInterfaz;
import Interfaz.SistemaPrincipalInterfaz;
import Logica.LoginLogica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInicio {
    @Test
    public void iniciarSistema() throws InterruptedException {
        LoginInterfaz loginInterfaz = new LoginInterfaz();
        Thread.sleep(4000);
        Assertions.assertTrue(loginInterfaz != null); //se creo la pantalla del login
        Assertions.assertTrue(LoginLogica.validarIngreso("root", "toor")); //se ingreso al sistema
        SistemaPrincipalInterfaz sistemaPrincipalInterfaz = new SistemaPrincipalInterfaz();
        Thread.sleep(4000);
        Assertions.assertTrue(sistemaPrincipalInterfaz != null); //se creo la pantalla del sistema principal
    }
}
