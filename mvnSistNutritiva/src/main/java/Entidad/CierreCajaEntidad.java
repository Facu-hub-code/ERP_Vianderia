package Entidad;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "cierres_caja")
public class CierreCajaEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcierres_caja", nullable = false)
    private Integer id;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "efectivo", nullable = false)
    private Double efectivo;

    @Column(name = "banco", nullable = false)
    private Double banco;

    @Column(name = "anulado", nullable = false)
    private Boolean anulado = false;

    public CierreCajaEntidad() {
    }

    public CierreCajaEntidad(Date fecha, Double efectivo, Double banco) {
        this.fecha = fecha;
        this.efectivo = efectivo;
        this.banco = banco;
        anulado = false;
    }

    public Boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(Boolean anulado) {
        this.anulado = anulado;
    }

    public Double getBanco() {
        return banco;
    }

    public void setBanco(Double banco) {
        this.banco = banco;
    }

    public Double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Double efectivo) {
        this.efectivo = efectivo;
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