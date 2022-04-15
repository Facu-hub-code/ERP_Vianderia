package Logica;

import Entidad.PedidoEntidad;
import Interfaz.TableroInterfaz;
import Repository.PedidoRepository;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class TableroLogica {

    public static void writeDinners(TableroInterfaz tableroInterfaz) {
        int lunes = 0, martes = 0, mcarne = 0, mpescaado = 0,jueves = 0, viernes = 0;
        PedidoRepository pedidoRepository = new PedidoRepository();
        ArrayList<PedidoEntidad> cenasPedidos = pedidoRepository.findCenas();
        for (PedidoEntidad pedido : cenasPedidos){
            LocalDate diaPedido =
                    LocalDate.of(pedido.getFecha().getYear() + 1900 //por algun motivo el metodo le resta 1900
                            , pedido.getFecha().getMonth() + 1 //por algun motivo le resta 1
                            , pedido.getFecha().getDate());
            if (diaPedido.getDayOfWeek() == DayOfWeek.MONDAY)
                lunes++;
            else if (diaPedido.getDayOfWeek() == DayOfWeek.TUESDAY)
                martes++;
            else if (diaPedido.getDayOfWeek() == DayOfWeek.WEDNESDAY){
                if (pedido.getTipo().equals("CENACARNE"))
                    mcarne++;
                else
                    mpescaado++;
            }
            else if (diaPedido.getDayOfWeek() == DayOfWeek.THURSDAY)
                jueves++;
            else if (diaPedido.getDayOfWeek() == DayOfWeek.FRIDAY)
                viernes++;
        }

        tableroInterfaz.setCenasLunes(lunes);
        tableroInterfaz.setCenasMartes(martes);
        tableroInterfaz.setCenasMiercoles(mcarne+mpescaado);
        tableroInterfaz.setCenasJueves(jueves);
        tableroInterfaz.setCenasViernes(viernes);
        tableroInterfaz.setCenaMiercolesCarne(mcarne);
        tableroInterfaz.setCenasMiercolesPescado(mpescaado);
    }

    public static void writeLunches(TableroInterfaz tableroInterfaz) {
        int lunes = 0, martes = 0, mcarne = 0, mpescaado = 0,jueves = 0, viernes = 0;
        PedidoRepository pedidoRepository = new PedidoRepository();
        ArrayList<PedidoEntidad> almuerzosPedidos = pedidoRepository.findAlmuerzos();
        for (PedidoEntidad pedido : almuerzosPedidos){
            LocalDate diaPedido =
                    LocalDate.of(pedido.getFecha().getYear() + 1900 //por algun motivo el metodo le resta 1900
                            , pedido.getFecha().getMonth() + 1 //por algun motivo le resta 1
                            , pedido.getFecha().getDate());
            if (diaPedido.getDayOfWeek() == DayOfWeek.MONDAY)
                lunes++;
            else if (diaPedido.getDayOfWeek() == DayOfWeek.TUESDAY)
                martes++;
            else if (diaPedido.getDayOfWeek() == DayOfWeek.WEDNESDAY){
                if (pedido.getTipo().equals("ALMUERZOCARNE"))
                    mcarne++;
                else
                    mpescaado++;
            }
            else if (diaPedido.getDayOfWeek() == DayOfWeek.THURSDAY)
                jueves++;
            else if (diaPedido.getDayOfWeek() == DayOfWeek.FRIDAY)
                viernes++;
        }

        tableroInterfaz.setAlmuerzosLunes(lunes);
        tableroInterfaz.setAlmuerzosMartes(martes);
        tableroInterfaz.setAlmuerzosMiercoles(mcarne+mpescaado);
        tableroInterfaz.setAlmuerzosJueves(jueves);
        tableroInterfaz.setAlmuerzosViernes(viernes);
        tableroInterfaz.setAlmuerzoMiercolesCarne(mcarne);
        tableroInterfaz.setAlmuerzoMiercolesPescado(mpescaado);
    }
}
