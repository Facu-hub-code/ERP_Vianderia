package Logica;

import Entidad.ClienteEntidad;
import Repository.ClienteRepository;

import java.util.ArrayList;
import java.util.List;

public class ClienteLogica {
    public static boolean addClient(ClienteEntidad cliente) {
        try{
            ClienteRepository clienteRepository = new ClienteRepository();
            return clienteRepository.save(cliente);
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

    public static ClienteEntidad getCliente(int idClienteVigente) {
        ClienteRepository clienteRepository = new ClienteRepository();
        ClienteEntidad cliente = clienteRepository.findbyID(idClienteVigente);
        return cliente;
    }

    public static boolean delete(ClienteEntidad cliente) {
        try{
            cliente.setAnulado(true);
            ClienteRepository clienteRepository = new ClienteRepository();
            clienteRepository.update(cliente);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
