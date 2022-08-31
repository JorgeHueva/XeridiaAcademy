package com.xeridia.gHerencias.ejercicios.interfaces;

public class Main {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(10);
        Triangulo t1 = new Triangulo(10, 20);
        Pentagono p1 = new Pentagono(5, 10);
        System.out.println(c1.getArea());
        System.out.println(t1.getArea());
        System.out.println(p1.getArea());

    }
}
