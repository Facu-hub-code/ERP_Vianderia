package Logica;

import Entidad.CierreCajaEntidad;
import Entidad.MovimientoEntidad;
import Hibernate.CajaRepository;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;
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

    public static void actualizarCierreCaja(double efectivo, double banco) {
        //traigo el ultimo cierre
        CierreCajaEntidad cierrecajaEntidad = getUltimoCierreCaja();
        double efectivoNuevo = efectivo, bancoNuevo = banco;
        Date hoy = new java.sql.Date(new java.util.Date().getTime());
        //si hay un cierre de caja ya registrado
        if(cierrecajaEntidad != null) {
            efectivoNuevo += cierrecajaEntidad.getEfectivo();
            bancoNuevo += cierrecajaEntidad.getBanco();
            //si el cierre de caja no es de hoy, creo uno nuevo
            if (!cierrecajaEntidad.getFecha().toLocalDate().equals(hoy.toLocalDate())) {
                CierreCajaEntidad nuevoCierre = CajaLogica.crearCierreCaja(hoy, efectivoNuevo, bancoNuevo);
                CajaLogica.guardarCierreCaja(nuevoCierre);
            } else {
                //si el cierre es de hoy, le setteo los nuevos valores y desp lo guardo
                cierrecajaEntidad.setEfectivo(efectivoNuevo);
                cierrecajaEntidad.setBanco(bancoNuevo);
                //aca sigo con la función y hago el session.merge más abajo
            }
        } else {
            //si no hay ningun cierre registrado, los parámetros son el primer movimiento. Le setteo directamente eso
            CierreCajaEntidad nuevoCierre = CajaLogica.crearCierreCaja(hoy, efectivoNuevo, bancoNuevo);
            CajaLogica.guardarCierreCaja(nuevoCierre);
        }
        CajaRepository cajaRepository = new CajaRepository();
        cajaRepository.update(cierrecajaEntidad);
    }

    private static boolean guardarCierreCaja(CierreCajaEntidad nuevoCierre) {
        CajaRepository cajaRepository = new CajaRepository();
        cajaRepository.save(nuevoCierre);
        return false;
    }

    private static CierreCajaEntidad crearCierreCaja(Date hoy, double efectivoNuevo, double bancoNuevo) {
        CierreCajaEntidad nuevoCierre = new CierreCajaEntidad();
        nuevoCierre.setFecha(hoy);
        nuevoCierre.setEfectivo(efectivoNuevo);
        nuevoCierre.setBanco(bancoNuevo);
        return nuevoCierre;
    }

    public static CierreCajaEntidad getUltimoCierreCaja() {
        CajaRepository cajaRepository = new CajaRepository();
        CierreCajaEntidad cierreCajaEntidad = cajaRepository.getUltimoCierre();
        return null;
    }
}
