package com.xeridia.estructuraDeDatos.ejercicios.supermercado.arrayList;

import java.util.Objects;

public class Producto {

   private double precio;
   private int cantidad;
   private String nombre;
    //CONSTRUCTORES
    public Producto(double precio, int cantidad, String nombre) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.cantidad = 0;
        this.precio = 0;
    }

    // METODO PARA REMOVE añadir o quitar productos segun compra (remove)
    public boolean proveNumber (int cantidad){
        if (cantidad >= 0){
            return true;
        }
        return false;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

// to equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Objects.equals(getNombre(), producto.getNombre());
    }

    //TO STRING
    @Override
    public String toString() {
        return "Producto: " +
                "precio= " + precio +
                ", cantidad= " + cantidad +
                ", nombre= " + nombre
                ;
    }
}
