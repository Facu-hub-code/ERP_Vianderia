package Entidad;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class PedidoEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpedidos", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clientes_idclientes")
    private ClienteEntidad clientesIdclientes;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Lob
    @Column(name = "tipo", nullable = false)
    private String tipo;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "viandas_idviandas", nullable = false)
    private ViandaEntidad viandasIdviandas;

    public PedidoEntidad() {
    }

    public PedidoEntidad(ClienteEntidad clientesIdclientes, ViandaEntidad viandasIdviandas, Date fecha, String tipo) {
        this.clientesIdclientes = clientesIdclientes;
        this.viandasIdviandas = viandasIdviandas;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public ViandaEntidad getViandasIdviandas() {
        return viandasIdviandas;
    }

    public void setViandasIdviandas(ViandaEntidad viandasIdviandas) {
        this.viandasIdviandas = viandasIdviandas;
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

    public ClienteEntidad getClientesIdclientes() {
        return clientesIdclientes;
    }

    public void setClientesIdclientes(ClienteEntidad clientesIdclientes) {
        this.clientesIdclientes = clientesIdclientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}