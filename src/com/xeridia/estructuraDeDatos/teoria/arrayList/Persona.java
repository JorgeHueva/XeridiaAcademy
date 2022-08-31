package com.xeridia.estructuraDeDatos.teoria.arrayList;

import java.util.Objects;

public class Persona { private int edad;
    private String nombre;
    private boolean isEmpleado;

    public Persona (int edad, String nombre, boolean isEmpleado){
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

}
