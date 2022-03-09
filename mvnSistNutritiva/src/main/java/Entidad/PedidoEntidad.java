package Entidad;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pedidos")
public class PedidoEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpedidos", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clientes_idclientes")
    private ClienteEntidad cliente;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Lob
    @Column(name = "tipo", nullable = false)
    private String tipo;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "viandas_idviandas", nullable = false)
    private ViandaEntidad vianda;

    @Column(name = "anulado", nullable = false)
    private boolean anulado;

    public PedidoEntidad() {
    }

    public PedidoEntidad(ClienteEntidad cliente, ViandaEntidad vianda, Date fecha, String tipo) {
        this.cliente = cliente;
        this.vianda = vianda;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public ViandaEntidad getVianda() {
        return vianda;
    }

    public void setVianda(ViandaEntidad viandasIdviandas) {
        this.vianda = viandasIdviandas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public java.sql.Date getFecha() {
        return fecha;
    }

    public void setFecha(java.sql.Date fecha) {
        this.fecha = fecha;
    }

    public ClienteEntidad getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidad clientesIdclientes) {
        this.cliente = clientesIdclientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }
}