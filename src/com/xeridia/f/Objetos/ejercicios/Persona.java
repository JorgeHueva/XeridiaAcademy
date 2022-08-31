package com.xeridia.f.Objetos.ejercicios;

public class Persona {
// ATRIBUTOS
    private int edad;
    private String nombre;
    private boolean empleado;

    private Fecha fechaNacimiento;


    //tener conteo del nº total
    private static int nPersonas =0;


    public static int getnPersonas() {
        return nPersonas;
    }

    public Persona(int edad, String nombre, boolean empleado, Fecha fechaNacimiento){

        this.edad = edad;
        this.nombre = nombre;
        this.empleado = empleado;
        this.fechaNacimiento = fechaNacimiento;
        nPersonas ++;
    }

    public Persona(int edad, String nombre, boolean empleado, int cuentaBancaria){

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


    private long obtenerEdad(){

        return (this.fechaNacimiento.getSegundo() + this.fechaNacimiento.getMinuto()*60 + this.fechaNacimiento.getHora()* 3600 + this.fechaNacimiento.getDia() * 8640 + this.fechaNacimiento.getMes() * 2628000 + this.fechaNacimiento.getAgno()* 31536000);
    }

    public boolean mayorQue (Object o) {

        Persona persona = (Persona) o;

        long p1 = this.obtenerEdad();
        long p2 = persona.obtenerEdad();

        if (p1 >= p2){
            return true;
        } else return false;
    }

    //COMPARAR SI LOS DOS SON EMPLEADOS
    public boolean empleadooNo (Object o){

        Persona persona = (Persona) o;

        boolean e1 = this.empleado;
        boolean e2 = persona.empleado;

        if (e1 == e2){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", empleado=" + empleado +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
