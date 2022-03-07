package Logica;

import Entidad.ClienteEntidad;
import Hibernate.ClienteRepository;

import java.util.ArrayList;
import java.util.List;

public class ClienteLogica {
    public static boolean agregarCliente(ClienteEntidad cliente) {
        try{
            ClienteRepository clienteRepository = new ClienteRepository();
            clienteRepository.save(cliente);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<ClienteEntidad> getClientes() {
        ClienteRepository clienteRepository = new ClienteRepository();
        List<ClienteEntidad> clientesList = clienteRepository.findAll();
        ArrayList<ClienteEntidad> clientes = new ArrayList<>(clientesList);
        return clientes;
    }

    public static boolean modificarCliente(ClienteEntidad cliente) {
        try{
            ClienteRepository clienteRepository = new ClienteRepository();
            clienteRepository.update(cliente);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
