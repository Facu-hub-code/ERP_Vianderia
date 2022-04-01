package Logica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LoginLogicaTest {
    LoginLogica loginLogica = new LoginLogica();

    @Test
    public void shouldAccesCorrectly(){
        Assertions.assertEquals(LoginLogica.validarIngreso("root", "toor"), true);
    }

}