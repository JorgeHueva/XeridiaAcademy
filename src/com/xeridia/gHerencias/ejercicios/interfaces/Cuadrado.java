package com.xeridia.gHerencias.ejercicios.interfaces;

public class Cuadrado implements Poligono{
    private double base;

    public Cuadrado(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return base*base;
    }
}
