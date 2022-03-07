package Entidad;

import javax.persistence.*;

@Entity
@Table(name = "ventas", indexes = {
        @Index(name = "fk_ventas_pedidos1_idx", columnList = "pedidos_idpedidos")
})
public class VentaEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idventas", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}