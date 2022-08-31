package com.xeridia.estructuraDeDatos.teoria.linkedList;

import com.xeridia.estructuraDeDatos.teoria.arrayList.Empresa;
import com.xeridia.estructuraDeDatos.teoria.arrayList.Persona;

public class Main {
    public static void main(String[] args) {
        Persona pepe = new Persona(24, "pepe",false);
        Persona pedro = new Persona(24, "pedro",true);

        com.xeridia.estructuraDeDatos.teoria.arrayList.Empresa empresa = new Empresa("merca");

        empresa.agregarEmpleado(pedro);
        empresa.agregarEmpleado(pepe);

        empresa.borrarEmpleado(pedro);

        System.out.println(empresa);



    }
}
