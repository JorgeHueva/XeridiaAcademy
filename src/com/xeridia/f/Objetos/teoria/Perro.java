package com.xeridia.f.Objetos.teoria;

public class Perro {

   //Atributos del objeto
    //Visibilidad: public, private (solo desde dentro objeto encapsulamiento) y package (por defecto)
   //Constructor es un metodo (como main) con public y la clase, pasamos un parametro entre parent
    //recomendable poner this.
//los metodos siempre son una accion, suelen ser cortos

    public String raza;
    private int edad;

    public Perro(String raza, int edad){
        this.raza = raza;
        this.edad = edad;
    }
    public void ladrar(){
         System.out.println("Guau");
}
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


