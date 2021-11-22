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
public class ViandaEntidad {
    private String nombre;
    private float precio;
    private String dias;

    public ViandaEntidad(String nombre, float precio, String dias) {
        this.nombre = nombre;
        this.precio = precio;
        this.dias = dias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
    
    
}
