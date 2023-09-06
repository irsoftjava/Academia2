package com.cga.persona.viajero;

public class Direccion {

    private String calle;
    private int numero;

    // Constructor

    public Direccion(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return calle + " " + numero;
    }
}
