package Logica;

import Entidad.PedidoEntidad;
import Entidad.VentaEntidad;
import Hibernate.PedidoRepository;
import Hibernate.VentasRepository;

import java.util.ArrayList;
import java.util.List;

public class VentasLogica {
    public static ArrayList<VentaEntidad> getVentas() {
         VentasRepository ventasRepository = new VentasRepository();
        List<VentaEntidad> ventasList = ventasRepository.findAll();
        ArrayList<VentaEntidad> ventas = new ArrayList<>(ventasList); //casteo Array
        return ventas;
    }
}
