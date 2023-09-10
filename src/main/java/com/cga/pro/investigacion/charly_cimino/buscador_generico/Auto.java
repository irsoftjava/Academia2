package com.cga.pro.investigacion.charly_cimino.buscador_generico;

public class Auto implements Identificable<String> {

    private String patente;
    private String color;

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto( " + patente + ", " + color + " )";
    }

    @Override
    public String getId() {
        return this.patente;
    }

    @Override
    public void setId(String x) {
        this.patente = x;
    }

    @Override
    public boolean sameId(String anotherId) {
        return this.patente.equals(anotherId);
    }
}
