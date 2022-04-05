package Logica;

import Repository.PedidoRepository;

public class TableroLogica {

    private static int almuerzos;
    private static int cenas = 0;

    public static int getCantAlmuerzos() {
        PedidoRepository pedidoRepository = new PedidoRepository();
        almuerzos = pedidoRepository.getCantAlmuerzos();
        return almuerzos;
    }

    public static int getCantCenas() {
        PedidoRepository pedidoRepository = new PedidoRepository();
        int total = pedidoRepository.findAll().size();
        return total - almuerzos;
    }

    public static int getAlmuerzosLunes() {
        return 0;
    }

    public static int getAlmuerzosMartes() {
        return 0;
    }

    public static int getAlmuerzosMiercoles() {
        return 0;
    }

    public static int getAlmuerzosJueves() {
        return 0;
    }

    public static int getAlmuerzosViernes() {
        return 0;
    }
}
