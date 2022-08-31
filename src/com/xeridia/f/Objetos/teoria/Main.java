package com.xeridia.f.Objetos.teoria;

public class Main {
    public static void main(String[] args) {
        Persona Jorge = new Persona(15, "Jorge", false);
        Persona Pepe = new Persona(19, "Pedro", false);
        Persona Juan = new Persona(22, "Juan", true);

        System.out.println(Juan.hashCode());

        Empresa empresa = new Empresa("xeridia");

        empresa.anyadirEmpleado(Jorge);
        empresa.anyadirEmpleado(Pepe);
        empresa.anyadirEmpleado(Juan);
        System.out.println(empresa);

        System.out.println(Juan.hashCode());
        empresa.buscarEmpleado("Pedro");
        System.out.println(empresa);


        empresa.borrarEmpleado("Pepe");
        System.out.println(empresa);

        Persona persona = empresa.buscarEmpleado("Juan");
        persona.setNombre("Pin");

        // MODIFICAR NOMBRE sin crear nueva variable
        // empresa.buscarEmpleado("Juan").setNombre("Guillermo");

        System.out.println(persona.hashCode());

        System.out.println(empresa);


    }
}
