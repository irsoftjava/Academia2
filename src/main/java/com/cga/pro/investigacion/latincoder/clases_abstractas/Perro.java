package com.cga.pro.investigacion.latincoder.clases_abstractas;

public class Perro extends Animal {

    public Perro() {
        super();
        setNombre("Perro");
    }

    @Override
    public void moverse() {
        System.out.println("El Perro se está moviendo.");
    }
}
