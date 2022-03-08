package Logica;

import Entidad.PedidoEntidad;
import Entidad.VentaEntidad;
import Hibernate.PedidoRepository;
import Hibernate.VentasRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class VentasLogica {
    public static ArrayList<VentaEntidad> getVentas() {
         VentasRepository ventasRepository = new VentasRepository();
        List<VentaEntidad> ventasList = ventasRepository.findAll();
        ArrayList<VentaEntidad> ventas = new ArrayList<>(ventasList); //casteo Array
        return ventas;
    }

    public static boolean modificarVenta(VentaEntidad venta) {
        try {
            VentasRepository ventasRepository = new VentasRepository();
            ventasRepository.update(venta);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean agregar(VentaEntidad venta) {
        try {
            VentasRepository ventasRepository = new VentasRepository();
            ventasRepository.save(venta);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
