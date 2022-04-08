package Logica;

import Entidad.PedidoEntidad;
import Interfaz.TableroInterfaz;
import Repository.PedidoRepository;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class PedidoLogica {

    public static boolean addPedido(PedidoEntidad pedido) {
        try {
            PedidoRepository pedidoRepository = new PedidoRepository();
            return pedidoRepository.save(pedido);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updatePedido(PedidoEntidad pedido) {
        try {
            PedidoRepository pedidoRepository = new PedidoRepository();
            return pedidoRepository.update(pedido);
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
                    LocalDate.of(pedido.getFecha().getYear() + 1900 //por algun motivo el metodo le resta 1900
                            , pedido.getFecha().getMonth() + 1 //por algun motivo le resta 1
                            , pedido.getFecha().getDate());
            if (diaPedido.getDayOfWeek() == day)
                pedidosDia.add(pedido);
        }
        return pedidosDia;
    }

    public static ArrayList<PedidoEntidad> getPedidos() {
        PedidoRepository pedidoRepository = new PedidoRepository();
        List<PedidoEntidad> pedidoList = pedidoRepository.findAll();
        return new ArrayList<>(pedidoList);
    }

    public static PedidoEntidad getPedido(int id) {
        PedidoRepository pedidoRepository = new PedidoRepository();
        return pedidoRepository.findbyID(id);
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

    public static boolean anularPedido(PedidoEntidad pedido) {
        try {
            pedido.setAnulado(true);
            PedidoRepository pedidoRepository = new PedidoRepository();
            return pedidoRepository.update(pedido);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
