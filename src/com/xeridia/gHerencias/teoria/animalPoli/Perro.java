package com.xeridia.gHerencias.teoria.animalPoli;

public class Perro extends Animal{
    //super referencia al padre (clase superior)
    @Override
    public void animalSound() {

        System.out.println("El perro ladra");
    }
}
