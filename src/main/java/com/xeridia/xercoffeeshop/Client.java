package com.xeridia.xercoffeeshop;


import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Client")
public class Client {


    @Column(name = "nombre",  length = 150)
    private String nombre;

    @Column(name = "apellido",  length = 150)
    private String apellido;
    @Id
    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "pass", length = 150)
    private String password;

    @OneToMany(mappedBy = "client", orphanRemoval = true)
    private Set<Favourite> favourites = new LinkedHashSet<>();

    public Set<Favourite> getFavourites() {
        return favourites;
    }

    public void setFavourites(Set<Favourite> favourites) {
        this.favourites = favourites;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos(String apellido) {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
