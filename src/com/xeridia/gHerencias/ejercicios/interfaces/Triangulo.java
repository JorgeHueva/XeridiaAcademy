package com.xeridia.gHerencias.ejercicios.interfaces;

public class Triangulo implements Poligono {
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base*altura/2;
    }
}
