package com.xeridia.f.Objetos.ejercicios.supermercado;

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
