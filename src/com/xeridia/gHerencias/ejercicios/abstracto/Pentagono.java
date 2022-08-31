package com.xeridia.gHerencias.ejercicios.abstracto;

public class Pentagono extends Poligono {
private double apotema;
private double perimetro;



    public Pentagono(double base, double apotema, double perimetro) {
        super(base);
        this.apotema = apotema;
        this.perimetro = perimetro;
    }

    @Override
    public double getArea() {
        return apotema*perimetro;
    }
}
