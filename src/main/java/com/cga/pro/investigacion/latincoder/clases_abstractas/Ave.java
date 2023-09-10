package com.cga.pro.investigacion.latincoder.clases_abstractas;

public class Ave extends Animal {

    public Ave() {
        super();
        setNombre("Ave");
    }

    @Override
    public void moverse() {
        System.out.println("El Ave se está volando.");
    }
}
