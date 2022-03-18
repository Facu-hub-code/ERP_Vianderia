package Entidad;

import javax.persistence.*;
import java.sql.Date;
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

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pedidos_idpedidos", nullable = false)
    private PedidoEntidad pedidosIdpedidos;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "movimientos_idmovimientos", nullable = false)
    private MovimientoEntidad movimientosIdmovimientos;

    @Column(name = "anulado", nullable = false)
    private Boolean anulado = false;

    public VentaEntidad() {
    }

    public VentaEntidad(Date fecha, PedidoEntidad pedidosIdpedidos, MovimientoEntidad movimientosIdmovimientos) {
        this.fecha = fecha;
        this.pedidosIdpedidos = pedidosIdpedidos;
        this.movimientosIdmovimientos = movimientosIdmovimientos;
    }

    public Boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(Boolean anulado) {
        this.anulado = anulado;
    }

    public MovimientoEntidad getMovimiento() {
        return movimientosIdmovimientos;
    }

    public void setMovimiento(MovimientoEntidad movimientosIdmovimientos) {
        this.movimientosIdmovimientos = movimientosIdmovimientos;
    }

    public PedidoEntidad getPedido() {
        return pedidosIdpedidos;
    }

    public void setPedido(PedidoEntidad pedidosIdpedidos) {
        this.pedidosIdpedidos = pedidosIdpedidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}