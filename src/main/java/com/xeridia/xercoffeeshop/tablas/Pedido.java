package com.xeridia.xercoffeeshop.tablas;

import com.xeridia.xercoffeeshop.tablas.Coffe_O;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;


@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long order_id;

    @Column(name = "regist_date", nullable = false)
    private LocalDate registDate;

    @OneToMany(mappedBy = "pedido", orphanRemoval = true)
    private Set<Coffe_O> coffe_oes = new LinkedHashSet<>();

    public Set<Coffe_O> getCoffe_oes() {
        return coffe_oes;
    }

    public void setCoffe_oes(Set<Coffe_O> coffe_oes) {
        this.coffe_oes = coffe_oes;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public LocalDate getRegistDate() {
        return registDate;
    }

    public void setRegistDate(LocalDate registDate) {
        this.registDate = registDate;
    }
}


