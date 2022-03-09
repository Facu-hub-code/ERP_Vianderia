package Entidad;

import javax.persistence.*;
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
    private LocalDate fecha;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
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
}