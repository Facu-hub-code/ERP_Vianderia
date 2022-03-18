package Logica;

import Entidad.VentaEntidad;
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

    public static boolean updateVenta(VentaEntidad venta) {
        try {
            VentasRepository ventasRepository = new VentasRepository();
            ventasRepository.update(venta);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean addVenta(VentaEntidad venta) {
        try {
            VentasRepository ventasRepository = new VentasRepository();
            ventasRepository.save(venta);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static VentaEntidad getVenta(int idVentaVigente) {
        VentasRepository ventasRepository = new VentasRepository();
        return ventasRepository.findbyID(idVentaVigente);
    }

    public static void delete(VentaEntidad venta) {
        venta.setAnulado(true);
        VentasRepository ventasRepository = new VentasRepository();
        ventasRepository.update(venta);
    }
}
