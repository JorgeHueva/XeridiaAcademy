package com.xeridia.gHerencias.ejercicios.abstracto;

public class Triangulo extends Poligono {
    private double altura;



    public Triangulo(double altura, double base) {
        super(base);
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base*altura)/2;
    }

}
