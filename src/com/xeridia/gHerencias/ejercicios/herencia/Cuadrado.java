package com.xeridia.gHerencias.ejercicios.herencia;

public class Cuadrado extends Poligono {


    public Cuadrado(double base) {
        super();
        this.lado = base;
    }

    public double getArea (){
            return lado * lado;

    }

}
