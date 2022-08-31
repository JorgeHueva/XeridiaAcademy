package com.xeridia.estructuraDeDatos.teoria.arrayList;



import java.util.ArrayList;
import java.util.LinkedList;

public class Empresa {

    private final ArrayList <Persona> empleados;  //
    private final String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>(); //INICIALIZAR EL ARRAYLIST

    }
    // AÑADIR
    public boolean agregarEmpleado(Persona persona){
        return this.empleados.add(persona);
    }

    public boolean agregarEmpleado(int edad, String nombre, boolean isEmpleado, int cuentaBancaria ){
        return this.agregarEmpleado(new Persona(edad ,nombre, isEmpleado));
    }
    // BUSCAR
        //indexof recibe un objeto y lo ejecuta en la lista
    public Persona buscarEmpleado (String nombre){
       return this.empleados.get(this.empleados.indexOf(new Persona(0, nombre,false)));
    }
    //  BORRAR NOMBRE
    public boolean borrarEmpleado (String nombre){
        return this.borrarEmpleado(new Persona(0, nombre, false));
    }
    // BORRAR PERSONA
    public boolean borrarEmpleado (Persona persona){
        return this.empleados.remove(persona);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Nombre: " + this.nombre + "\n Lista empleados: \n");
        for (Persona p : empleados) {
            if (p == null){
            } else {
                output.append(p).append("\n");
            }
        }
        for  (Persona p : empleados) {
        } return output.toString();
    }
}
