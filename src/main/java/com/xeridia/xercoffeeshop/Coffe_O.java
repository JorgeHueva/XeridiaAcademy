package com.xeridia.xercoffeeshop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



    @Entity
    @Table(name = "Coffe_O")
    public class Coffe_O {

        @Id
        @Column(name = "Type_Coffe", length = 150)
        private String typeCoffe_O;

        @Column(name = "num_Coffe")
        private double num_Coffe;

        @Column(name = "Price")
        private double price;

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
    }

