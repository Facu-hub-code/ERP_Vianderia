import Entidad.Cliente;
import Hibernate.ClienteRepository;
import Hibernate.HibernateUtil;
import Logica.LoginLogica;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        LoginLogica.validarIngreso("root", "Facu4813");

        Cliente cliente = new Cliente();
        cliente.setNombre("Facundo");
        cliente.setApellido("Lorenzo");
        cliente.setDni("41411627");
        cliente.setEmail("faculoren7@gmail.com");
        cliente.setTelefono("3585098671");

        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.sasve(cliente);

    }
}
