package com.xeridia.estructuraDeDatos.teoria.arrayList;

public class Main {
    public static void main(String[] args) {
        Persona pepe = new Persona(24, "pepe",false);
        Persona pedro = new Persona(24, "pedro",true);

        Empresa empresa = new Empresa("merca");

        empresa.agregarEmpleado(pedro);
        empresa.agregarEmpleado(pepe);

        empresa.borrarEmpleado(pedro);

        System.out.println(empresa);



    }
}
