package com.xeridia.f.Objetos.teoria;

import java.util.Arrays;

public class Empresa {
    final int TRABJADORES_MAX = 200;

    private final Persona empleados[];  //array de tipo persona permitiendo guardar dentro varias personas mas corchetes mas arrays
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new Persona [TRABJADORES_MAX];

    }
    //una clase empresa con atributos definidos y constructor
    //siguiente añadir metodos para añadir buscar y eliminar
    public boolean anyadirEmpleado (Persona persona){
        for (int i = 0; i < this.empleados.length; i++) {
           if(this.empleados[i] == null) {
               this.empleados[i] = persona;
               return true;
           }
        }
        return false;
    }
//BUSCAS POSICIONES
    public Persona buscarEmpleado (String nombre){
       int pos = this.buscarPos(nombre);
       if (pos == -1) return null;
       return this.empleados[pos];
    }
    public int buscarPos (String nombre){
        for (int i = 0; i < this.empleados.length; i++) {
            if(this.empleados[i] != null && this.empleados[i].getNombre().equals(nombre)) {
                return i;
            }

//           if (this.empleados!= null){
//               if (this.empleados[i].getNombre().equals(nombre)) {
//                   return i;
//               } else {
//                   return null;
//               }
//           }

        }
        return -1;

    }

//    private Persona obtenerPosEmpleado(Persona empleado){
//        for (int i = 0; i < this.empleados.length; i++) {
//            if (this.empleados[i].getNombre().equals(nombre)){
//                return this.empleados[i];
//            }
//        }
//        return null;
//    }

    public boolean borrarEmpleado (String nombre){
        int pos = this.buscarPos(nombre);
        if (pos == -1){
            return false;
        } this.empleados[pos] = null;
        return true;
    }

    public boolean borrarEmpleado (Persona persona){
        return false;
    }

    public Persona[] getEmpleados() {
        return empleados;
    }



    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Nombre: " + this.nombre + "\n Lista empleados: \n");
        for (int i = 0; i < this.empleados.length; i++) {
            if (this.empleados[i]== null){
            } else {
                output.append(empleados[i]).append("\n");
            }
        }
        return output.toString();

//        return "Empresa{" +
//                "TRABJADORES_MAX=" + TRABJADORES_MAX +
//                ", empleados=" + Arrays.toString(empleados) +
//                ", nombre='" + nombre + '\'' +
//                '}';
    }
}
