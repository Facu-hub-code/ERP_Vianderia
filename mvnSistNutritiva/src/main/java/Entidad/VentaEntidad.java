package Entidad;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ventas", indexes = {
        @Index(name = "fk_ventas_movimientos1_idx", columnList = "movimientos_idmovimientos"),
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

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pedidos_idpedidos", nullable = false)
    private PedidoEntidad pedidosIdpedidos;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "movimientos_idmovimientos", nullable = false)
    private MovimientoEntidad movimientosIdmovimientos;

    @Column(name = "anulado", nullable = false)
    private Boolean anulado = false;

    public Boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(Boolean anulado) {
        this.anulado = anulado;
    }

    public MovimientoEntidad getMovimientosIdmovimientos() {
        return movimientosIdmovimientos;
    }

    public void setMovimientosIdmovimientos(MovimientoEntidad movimientosIdmovimientos) {
        this.movimientosIdmovimientos = movimientosIdmovimientos;
    }

    public PedidoEntidad getPedidosIdpedidos() {
        return pedidosIdpedidos;
    }

    public void setPedidosIdpedidos(PedidoEntidad pedidosIdpedidos) {
        this.pedidosIdpedidos = pedidosIdpedidos;
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