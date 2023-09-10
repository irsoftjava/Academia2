package com.cga.pro.investigacion.latincoder.clases_abstractas;

public abstract class Animal {

    private String nombre;

    public Animal() {
    }

    public void comer() {
        System.out.println("El " + nombre + " está Comiendo.");
    }

    public abstract void moverse();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
