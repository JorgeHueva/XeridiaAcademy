package com.xeridia.gHerencias.teoria.clasesAbstractas;

public class Felino extends Animal {

    public Felino(String name, int numeroPatas) {
        super(name, numeroPatas);
    }

    //metodo acechar
    public void acechar(){
        System.out.println("El animal esta acechando");
    }

    @Override
    public void animalSound() {

    }

    @Override
    public void sayName() {

    }
}
