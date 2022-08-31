package com.xeridia.gHerencias.teoria.interfac;
// SOLO SE PUEDEN IMPLEMENTAR INTERFACES
public class Cat implements Animal{
    @Override
    public void animalSound() {
        System.out.println("miua");
    }

    @Override
    public void sleep() {
        System.out.println("zzz");
    }
}
