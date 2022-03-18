package Logica;

import Entidad.MovimientoEntidad;
import Hibernate.CajaRepository;

import java.util.ArrayList;

public class CajaLogica {
    public static boolean addMovimiento(MovimientoEntidad movimientoEntidad) {
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

    public static boolean updateMovimiento(MovimientoEntidad movimientoEntidad) {
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

    public static boolean deleteMovimiento(MovimientoEntidad movimientoEntidad) {
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

    public static double getSaldoBanco() {
        CajaRepository cajaRepository = new CajaRepository();
        double banco = 0.0;
        for(MovimientoEntidad movimiento : cajaRepository.findHoyEfectivo(false)){
            banco += movimiento.getMonto();
        }
        return banco;
    }

    public static double getSaldoEfectivo(){
        CajaRepository cajaRepository = new CajaRepository();
        double efectivo = 0.0;
        for(MovimientoEntidad movimiento : cajaRepository.findHoyEfectivo(true)){
            efectivo += movimiento.getMonto();
        }
        return efectivo;
    }
}
