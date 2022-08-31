package com.xeridia.estructuraDeDatos.teoria.set;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class Persona implements Comparable {
    private int edad;
    private String nombre;
    private boolean isEmpleado;

    public Persona(int edad, String nombre, boolean isEmpleado){
        this.edad = edad;
        this.nombre = nombre;
        this.isEmpleado = isEmpleado;
        nPersonas ++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.isEmpleado = false;
    }

    //tener conteo del nº total
    private static int nPersonas =0;


    public static int getnPersonas() {
        return nPersonas;
    }

    @Override
    public String toString() {
        return "Persona " + "edad= " + edad + ", nombre= " + nombre  + ", empleado= " + isEmpleado ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEdad());
    }

    // Hacer el equals para el remove, add, get
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(getNombre(), persona.getNombre());
    }


    public void saludar(){
        System.out.println("Hola");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEmpleado() {
        return isEmpleado;
    }

    public void setEmpleado(boolean empleado) {
        this.isEmpleado = empleado;
    }

    //COMPARE TO
    // Castear para dejar el objeto como una clase persona
    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.edad, ((Persona)o).getEdad());
    }

    //COMPARE TO otra manera
//    public int compareTo(Object o) {
//        if (this.edad >((Persona)o).getEdad()) {
//            return 1;
//        } else if (this.edad == ((Persona)o).getEdad()) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }

}
