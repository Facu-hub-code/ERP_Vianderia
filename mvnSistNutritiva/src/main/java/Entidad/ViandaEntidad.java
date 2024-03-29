package Entidad;

import javax.persistence.*;

@Entity
@Table(name = "viandas")
public class ViandaEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idviandas", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "anulado", nullable = false)
    private boolean anulado;

    public ViandaEntidad() {
    }

    public ViandaEntidad(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        anulado = false;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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