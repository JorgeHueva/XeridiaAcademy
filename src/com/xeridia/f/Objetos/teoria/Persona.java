package com.xeridia.f.Objetos.teoria;

public class Persona {

    private int edad;
    private String nombre;
    private boolean empleado;


    //tener conteo del nº total
    private static int nPersonas =0;


    public static int getnPersonas() {
        return nPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", empleado=" + empleado +
                '}';
    }

    public Persona (int edad, String nombre, boolean empleado){

        this.edad = edad;
        this.nombre = nombre;
        this.empleado = empleado;
        nPersonas ++;
    }

    public Persona (int edad, String nombre, boolean empleado,int cuentaBancaria){

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
        return empleado;
    }

    public void setEmpleado(boolean empleado) {
        this.empleado = empleado;
    }
}
