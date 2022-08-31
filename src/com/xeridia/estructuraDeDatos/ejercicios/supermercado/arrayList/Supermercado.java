package com.xeridia.estructuraDeDatos.ejercicios.supermercado.arrayList;



public class Supermercado {
    private Almacen almacen;
    private String nombre;
//CONSTRUCTOR

    public Supermercado(String nombre) {
        this.almacen = new Almacen();
        this.nombre = nombre;
    }

    //PASAR METODOS A SUPERMERCADO
    //ADD
   public boolean addAlmacen (Producto producto){
       if (almacen.agregarProducto(producto)){
           return true;
       }
       return false;
   }

    //REMOVE
   public boolean removeAlmacen (String nombre, int cantidad){
       if (almacen.borrarProducto(nombre, cantidad)){
           return true;
       }
       return false;
   }

   //SEARCH
   public Producto buscarAlmacen (String nombre){
    if (almacen.buscarProducto(nombre) != null){
        return almacen.buscarProducto(nombre);
    }
    return null;
   }



    //return.thisAlmacen.add()

    @Override
    public String toString() {
        return "Supermercado " +
                "almacen= " + almacen
                ;
    }
}
