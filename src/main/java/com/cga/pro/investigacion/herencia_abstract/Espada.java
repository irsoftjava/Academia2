package com.cga.pro.investigacion.herencia_abstract;

public class Espada {

    private int filo;

    public Espada(int filo) {
        this.filo = filo;
    }

    public int danioFinal(int danioHeroe) {
        return this.filo * danioHeroe;
    }
}
