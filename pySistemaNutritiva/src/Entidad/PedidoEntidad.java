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
public class PedidoEntidad {
    private String cliente;
    private String vianda;
    private int unidades;
    private float precio;
    private String dias;
    private int id;
    private TipoComida tipo;

    public PedidoEntidad(String cliente, String vianda, int unidades, float precio, String dias, int id, TipoComida tipo) {
        this.cliente = cliente;
        this.vianda = vianda;
        this.unidades = unidades;
        this.precio = precio;
        this.dias = dias;
        this.id = id;
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVianda() {
        return vianda;
    }

    public void setVianda(String vianda) {
        this.vianda = vianda;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoComida getTipo() {
        return tipo;
    }

    public void setTipo(TipoComida tipo) {
        this.tipo = tipo;
    }
    
    
}
