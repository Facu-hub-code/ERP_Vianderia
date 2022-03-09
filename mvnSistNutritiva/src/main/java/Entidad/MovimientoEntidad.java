package Entidad;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "movimientos")
public class MovimientoEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimientos", nullable = false)
    private Integer id;

    @Column(name = "monto", nullable = false)
    private Double monto;

    @Column(name = "observacion", length = 45)
    private String observacion;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "anulado", nullable = false)
    private boolean anulado;

    public MovimientoEntidad() {
    }

    public MovimientoEntidad(double monto, String observacion, Date fecha) {
        this.monto = monto;
        this.observacion = observacion;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }
}