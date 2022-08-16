package com.xeridia.xercoffeeshop;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;


@Entity
@Table(name = "Coffe")
public class Coffe  {
    @Id
    @Column(name = "Type_Coffe",  length = 150)
    private String typeCoffe;

    @Column(name = "Price")
    private double price;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "coffe", orphanRemoval = true)
    private Set<Coffe_O> coffe_oes = new LinkedHashSet<>();

    public Set<Coffe_O> getCoffe_oes() {
        return coffe_oes;
    }

    public void setCoffe_oes(Set<Coffe_O> coffe_oes) {
        this.coffe_oes = coffe_oes;
    }

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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

