package com.xeridia.gHerencias.teoria.interfac;
//clases abstractas contineen metodos concretos y las interfaces solo definen como funcionan
//herencia multiple --> interfaces,  metodos concretos --> abstractas
public class Dog implements Mastin, Huskie {

    @Override
    public void animalSound() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public boolean isHuskie() {
        return false;
    }

    @Override
    public boolean isMastin() {
        return false;
    }
}
