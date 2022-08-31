package com.xeridia.estructuraDeDatos.ejercicios.supermercado.arrayList;

import java.util.ArrayList;

public class Almacen {

   private int maxAmount = 10;


   private final ArrayList<Producto> productos;  //se define el array

   //Inicializando arraylis
   public Almacen() {
      this.productos = new ArrayList<>();
   }


   //METODO SEARCH
   public Producto buscarProducto(String nombre) {
      return this.productos.get(this.productos.indexOf(new Producto(10, 5, nombre)));
   }

   //BORRAR NOMBRE
   public boolean borrarProducto(String nombre, int cantidad) {
      int resto = 0;
      int pos = this.productos.indexOf(new Producto(10, 5,nombre));
      if (pos == -1){
         return false;
      } else {
         resto = this.productos.get(pos).getCantidad() - cantidad;
         if (this.productos.get(pos).proveNumber(cantidad)){
            if (resto == 0){
               this.productos.remove(new Producto(10, 5,nombre));
               return false;
            } else if( resto < 0){
               return false;
            } else {
               this.productos.get(pos).setCantidad(resto);
               return false;
            }
         }
      }
      return true;
   }


   // BORRAR PERSONA
   public boolean borrarProducto(Producto producto) {
      return this.productos.remove(productos);
   }
   // AÑADIR

   public int cont() {
      int cont = 0;
      for (Producto producto : productos) {
         if (producto != null) {
            cont = cont + producto.getCantidad();
         }
      }
      return cont;
   }
   public boolean agregarProducto(Producto producto) {
      if (!this.pruebaSiEsta(producto.getNombre())) {
         return false;
      } else {
         //introducir que como maximo haya 10 productos
         if ((cont() + producto.getCantidad()) < maxAmount) {
               this.productos.add(producto);
         }
       return false;
      }
   }
   public boolean pruebaSiEsta(String nombre) {
      int prueba = this.productos.indexOf(new Producto(10, 5, nombre));
     // prueba distinto de -1 porque es que no encuentra la posicion
      if (prueba != -1) {
         return true;
      }
      return false;
   }
   public boolean agregarProducto(double precio, int cantidad, String nombre) {
      return this.agregarProducto(new Producto(precio, cantidad, nombre));
   }

   // TO STRING
   @Override
   public String toString() {
      StringBuilder output = new StringBuilder("Producto: " + this.productos + "\n Lista productos: \n");
      for (Producto p : productos) {
         if (p == null){
         } else {
            output.append(p).append("\n");
         }
      }
      return output.toString();

   }
}



