package Entidad;

import javax.persistence.*;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpedidos", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clientes_idclientes")
    private Cliente clientesIdclientes;

    public Cliente getClientesIdclientes() {
        return clientesIdclientes;
    }

    public void setClientesIdclientes(Cliente clientesIdclientes) {
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