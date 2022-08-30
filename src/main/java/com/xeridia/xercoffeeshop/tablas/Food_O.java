package com.xeridia.xercoffeeshop.tablas;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Food_O")
public class Food_O {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "num_Food", nullable = false)
    private int  num_Food;
    @Column(name = "Price", nullable = false)
    private double price;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "food_type_food", referencedColumnName = "type_food")
    private Food food;

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

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNum_Food() {
        return num_Food;
    }

    public void setNum_Food(int num_Food) {
        this.num_Food = num_Food;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
