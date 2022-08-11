package com.xeridia.xercoffeeshop;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Coffe_O")
public class Coffe_O {

    @Id
    @Column(name = "Type_Coffe", nullable = false,length = 150)
    private String typeCoffe_O;
    @Column(name = "num_Coffe", nullable = false)
    private double num_Coffe;
    @Column(name = "Price", nullable = false)
    private double price;
    @Column(name = "order_id")
    private double order_id;
    public String getTypeCoffe_O() {
        return typeCoffe_O;
    }

    public void setTypeCoffe_O(String typeCoffe_O) {
        this.typeCoffe_O = typeCoffe_O;
    }

    public double getNum_Coffe() {
        return num_Coffe;
    }

    public void setNum_Coffe(double num_Coffe) {
        this.num_Coffe = num_Coffe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOrder_id() {
        return order_id;
    }

    public void setOrder_id(double order_id) {
        this.order_id = order_id;
    }
}

