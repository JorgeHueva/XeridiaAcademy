package com.xeridia.xercoffeeshop;

import javax.persistence.*;
import java.util.Calendar;


    @Entity
    @Table(name = "Pedido")
    public class Pedido {

        @Id
        @Column(name = "ID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "REGIST_DATE")
        private Calendar registDate;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public Calendar getRegistDate() {
            return registDate;
        }

        public void setRegistDate(Calendar registDate) {
            this.registDate = registDate;
        }
    }

