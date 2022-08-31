package com.xeridia.gHerencias.ejercicios.abstracto;

public class Cuadrado extends Poligono {

    public Cuadrado(double base) {
        super(base);
    }

    @Override
    public double getArea() {
        return base*base;
    }
}
