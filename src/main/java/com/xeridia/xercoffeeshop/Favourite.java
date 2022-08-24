package com.xeridia.xercoffeeshop;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Favourite")
public class Favourite {

    @Column(name = "Type_Coffe",  length = 150)
    private String typeCoffe;

    @Column(name = "Price")
    private double price;

    @Column(name = "description")
    private String description;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_email")
    private Client client;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    @Override
    public String toString() {
        return "Favourite{" +
                "typeCoffe='" + typeCoffe + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", client=" + client +
                ", id=" + id +
                '}';
    }
}
