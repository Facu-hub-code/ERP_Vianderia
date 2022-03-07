package Entidad;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpedidos", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY) //todo: revisar el tefchtype
    @JoinColumn(name = "clientes_idclientes")
    private ClienteEntidad clientesIdclientes;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Lob
    @Column(name = "tipo", nullable = false)
    private String tipo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "viandas_idviandas", nullable = false)
    private ViandaEntidad viandasIdviandas;

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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
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