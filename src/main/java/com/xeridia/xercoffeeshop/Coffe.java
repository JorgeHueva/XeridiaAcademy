package com.xeridia.xercoffeeshop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



    @Entity
    @Table(name = "Coffe")
    public class Coffe {

        @Id
        @Column(name = "Type_Coffe",  length = 150)
        private String typeCoffe;

        @Column(name = "Price")
        private double price;

        public String getTypeCoffe() {
            return typeCoffe;
        }

        public void setTypeCoffe(String typeCoffe) {
            this.typeCoffe = typeCoffe;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

