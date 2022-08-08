package com.xeridia.xercoffeeshop;

import javax.persistence.*;
import java.util.Calendar;



@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REGIST_DATE")
    private Calendar registDate;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Calendar getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Calendar registDate) {
        this.registDate = registDate;
    }
}


