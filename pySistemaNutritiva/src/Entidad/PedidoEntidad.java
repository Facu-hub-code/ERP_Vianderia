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
    private Dia dia;
    private int id;
    private TipoComida tipo;

    public PedidoEntidad(String cliente, String vianda, int unidades, float precio, Dia dia, int id, TipoComida tipo) {
        this.cliente = cliente;
        this.vianda = vianda;
        this.unidades = unidades;
        this.precio = precio;
        this.dia = dia;
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

    public Dia getDias() {
        return dia;
    }

    public void setDias(Dia dias) {
        this.dia = dias;
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
