package com.xeridia.xercoffeeshop.tablas;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;

@Entity
@Table(name = "Coffe_O")
public class Coffe_O {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "coffe_type_coffe", referencedColumnName = "type_coffe")
    private Coffe coffe;

    @Column(name = "num_Coffe", nullable = false)
    private int  num_Coffe;
    @Column(name = "Price", nullable = false)
    private double price;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "pedido_order_id", referencedColumnName = "order_id")
    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Coffe getCoffe() {
        return coffe;
    }

    public void setCoffe(Coffe coffe) {
        this.coffe = coffe;
    }

    public int getNum_Coffe() {
        return num_Coffe;
    }

    public void setNum_Coffe(int num_Coffe) {
        this.num_Coffe = num_Coffe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

