package com.xeridia.estructuraDeDatos.ejercicios.supermercado.linkedList;



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
   // DUPLICAR
    public void duplicarAlmacen (){
        almacen.duplicaCantidad();
    }

    //BORRAS MAS DE 5 ITERATOR
    public void removeMoreThan5(){
        almacen.removeMoreThan5();
    }

    //return.thisAlmacen.add()

    @Override
    public String toString() {
        return "Supermercado " + "almacen= " + almacen;
    }
}
