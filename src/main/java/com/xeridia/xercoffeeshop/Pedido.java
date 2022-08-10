package com.xeridia.xercoffeeshop;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;



@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @Column(name = "order_id")
    private int order_id;

    @Column(name = "regist_date", nullable = false)
    private LocalDate registDate;


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public LocalDate getRegistDate() {
        return registDate;
    }

    public void setRegistDate(LocalDate registDate) {
        this.registDate = registDate;
    }
}


