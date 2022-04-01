package Logica;

import Entidad.PedidoEntidad;
import Repository.PedidoRepository;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class PedidoLogica {

    public static boolean agregarPedido(PedidoEntidad pedido) {
        try {
            PedidoRepository pedidoRepository = new PedidoRepository();
            pedidoRepository.save(pedido);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updatePedido(PedidoEntidad pedido) {
        try {
            PedidoRepository pedidoRepository = new PedidoRepository();
            pedidoRepository.update(pedido);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<PedidoEntidad> getPedidos(DayOfWeek day) {
        PedidoRepository repo = new PedidoRepository();
        ArrayList<PedidoEntidad> pedidos = new ArrayList<>(repo.findAll());
        ArrayList<PedidoEntidad> pedidosDia = new ArrayList<>();


        for (PedidoEntidad pedido : pedidos) {
            LocalDate diaPedido =
                    LocalDate.of(pedido.getFecha().getYear() + 1900 //no se porque el metodo le resta 1900
                            , pedido.getFecha().getMonth() + 1 //no se porque le resta 1
                            , pedido.getFecha().getDate());
            if (diaPedido.getDayOfWeek() == day) {
                pedidosDia.add(pedido);
            }
        }
        return pedidosDia;
    }

    public static ArrayList<PedidoEntidad> getPedidos() {
        PedidoRepository repo = new PedidoRepository();
        List<PedidoEntidad> pedidoList = repo.findAll(); //guardo todos los pedidos
        ArrayList<PedidoEntidad> pedidos = new ArrayList<>(pedidoList); //casteo Array
        return pedidos;
    }

    public static PedidoEntidad getPedido(int id) {
        PedidoRepository pedidoRepository = new PedidoRepository();
        PedidoEntidad pedido = pedidoRepository.findbyID(id);
        return pedido;
    }

    public static int contarPedidos(DayOfWeek day) {
        ArrayList<PedidoEntidad> pedidos = getPedidos(day);
        return pedidos.size();
    }

    public static boolean delete(PedidoEntidad pedido) {
        try{
            pedido.setAnulado(true);
            PedidoRepository pedidoRepository = new PedidoRepository();
            pedidoRepository.update(pedido);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
