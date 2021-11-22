/*
 * 
 * 
 * 
 */
package Entidad;

/**
 *
 * @author facul
 */
public class MovimientoEntidad {
    private float monto;
    private String especificacion;
    private boolean ingreso;
    private boolean efectivo;
    private String fecha;

    public MovimientoEntidad(float monto, String especificacion, boolean ingreso, boolean efectivo, String fecha) {
        this.monto = monto;
        this.especificacion = especificacion;
        this.ingreso = ingreso;
        this.efectivo = efectivo;
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public boolean isIngreso() {
        return ingreso;
    }

    public void setIngreso(boolean ingreso) {
        this.ingreso = ingreso;
    }

    public boolean isEfectivo() {
        return efectivo;
    }

    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
