package com.xeridia.gHerencias.teoria.clasesAbstractas;

public class Cat extends Felino {
    public Cat(String name, int numeroPatas) {
        super(name, numeroPatas);
    }
// los metodos abstractos hay que crearlos

    @Override
    public void animalSound() {
        System.out.println("miau");

    }

}
