package com.xeridia.gHerencias.ejercicios.herencia;

public class Triangulo extends Poligono {

    private double altura;

    public Triangulo(double lado, double altura) {
        super();
        this.lado = lado;
        this.altura = altura;
    }

    public double getArea (){
        return (lado *altura/2);

    }

}
