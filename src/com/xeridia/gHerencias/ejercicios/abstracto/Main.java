package com.xeridia.gHerencias.ejercicios.abstracto;


public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        Triangulo triangulo = new Triangulo(4, 3);
        Pentagono pentagono = new Pentagono(0, 5, 3);

        System.out.println(cuadrado.getArea());
        System.out.println(triangulo.getArea());
        System.out.println(pentagono.getArea());
    }
}
