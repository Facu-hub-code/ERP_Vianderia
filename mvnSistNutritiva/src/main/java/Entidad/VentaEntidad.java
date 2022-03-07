package Entidad;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ventas", indexes = {
        @Index(name = "fk_ventas_pedidos1_idx", columnList = "pedidos_idpedidos")
})
public class VentaEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idventas", nullable = false)
    private Integer id;

    @Column(name = "monto", nullable = false)
    private Double monto;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pedidos_idpedidos", nullable = false)
    private PedidoEntidad pedido;

    public VentaEntidad() {
    }

    public VentaEntidad(Double monto, LocalDate fecha, PedidoEntidad pedido) {
        this.monto = monto;
        this.fecha = fecha;
        this.pedido = pedido;
    }

    public PedidoEntidad getPedido() {
        return pedido;
    }

    public void setPedido(PedidoEntidad pedidosIdpedidos) {
        this.pedido = pedidosIdpedidos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}