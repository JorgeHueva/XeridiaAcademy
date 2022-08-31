package com.xeridia.gHerencias.ejercicios.abstracto;

abstract class Poligono{
    protected double base;

    public Poligono(double base) {
        this.base = base;
    }
    public abstract double getArea();
}
