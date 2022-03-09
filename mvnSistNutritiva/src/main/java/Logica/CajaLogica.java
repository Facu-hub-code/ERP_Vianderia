package Logica;

import Entidad.MovimientoEntidad;
import Entidad.VentaEntidad;
import Hibernate.CajaRepository;

import java.util.ArrayList;

public class CajaLogica {
    public static boolean agregarMovimiento(MovimientoEntidad movimientoEntidad) {
        try {
            CajaRepository cajaRepository = new CajaRepository();
            cajaRepository.save(movimientoEntidad);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<MovimientoEntidad> getMovimientos() {
        CajaRepository cajaRepository = new CajaRepository();
        ArrayList<MovimientoEntidad> movimientos = new ArrayList<>(cajaRepository.findAll());
        return movimientos;
    }

    public static boolean modificarMovimiento(MovimientoEntidad movimientoEntidad) {
        try {
            CajaRepository cajaRepository = new CajaRepository();
            cajaRepository.update(movimientoEntidad);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static MovimientoEntidad getMovimiento(int idMovmientoVigente) {
        CajaRepository cajaRepository = new CajaRepository();
        MovimientoEntidad movimiento = cajaRepository.findbyID(idMovmientoVigente);
        return movimiento;
    }

    public static boolean eliminarMovimiento(MovimientoEntidad movimientoEntidad) {
        try{
            movimientoEntidad.setAnulado(true);
            CajaRepository cajaRepository = new CajaRepository();
            cajaRepository.update(movimientoEntidad);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
