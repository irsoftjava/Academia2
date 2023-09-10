package com.cga.pro.investigacion.charly_cimino.buscador_generico;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("BCD234", "Verde"));
        autos.add(new Auto("DEF458", "Blanco"));
        autos.add(new Auto("CDE345", "Azul"));
        autos.add(new Auto("DEF457", "Gris"));
        autos.add(new Auto("HZT329", "Rojo"));
        autos.add(new Auto("DEF457", "Negro"));
        autos.add(new Auto("JUI190", "Magenta"));

        Buscador<Auto, String> buscadorDeAutosPorPatentes;
        buscadorDeAutosPorPatentes = new Buscador<>();
        Auto a = buscadorDeAutosPorPatentes.buscar(autos, "CDE345");
        System.out.println(a);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1234, "Pepe", "Gómez"));
        personas.add(new Persona(1596, "Ana", "Pérez"));
        personas.add(new Persona(7645, "Luis", "López"));
        personas.add(new Persona(2345, "Lía", "Alvarez"));
        personas.add(new Persona(4763, "Sara", "Benitez"));
        personas.add(new Persona(8746, "Maria", "Rodriguez"));
        personas.add(new Persona(2046, "Elena", "Marichal"));

        Buscador<Persona, Integer> buscadrDePersonasPorDni;
        buscadrDePersonasPorDni = new Buscador<>();
        Persona p = buscadrDePersonasPorDni.buscar(personas, 4763);
        System.out.println(p);
    }
}
