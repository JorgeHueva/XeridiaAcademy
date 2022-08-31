package com.xeridia.f.Objetos.ejercicios.supermercado;

public class Supermercado {
    private Almacen almacen;
    private String nombre;
//CONSTRUCTOR
    public Supermercado(String nombre) {
        this.almacen = new Almacen();
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    //PASAR METODOS A SUPERMERCADO
    //ADD
   public boolean addAlmacen (Producto producto){
       if (almacen.add(producto)){
           return true;
       }
       return false;
   }

    //REMOVE
   public boolean removeAlmacen (String nombre, int cantidad){
       if (almacen.remove(nombre, cantidad)){
           return true;
       }
       return false;
   }

   //SEARCH
   public Producto searchAlmacen (String nombre){
    if (almacen.searchEmp(nombre) != null){
        return almacen.searchEmp(nombre);
    }
    return null;
   }
    public int searchPosAlmacen (String nombre){
        if (almacen.searchPos(nombre) != -1){
            return searchPosAlmacen(nombre);
        }
        return -1;
    }


    //return.thisAlmacen.add()

    @Override
    public String toString() {
        return "Supermercado " +
                "almacen= " + almacen
                ;
    }
}
