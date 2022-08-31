package com.xeridia.gHerencias.ejercicios.herencia;

public class Poligono {
    protected double numeroLados;
    //Base lo uso para cuadrado y triangulo
    protected double lado;

    public Poligono(double numeroLados, double base) {
        this.numeroLados = numeroLados;
        this.lado = base;

    }

    public Poligono() {}
    public double getArea() {
        return 0;
    }

}
