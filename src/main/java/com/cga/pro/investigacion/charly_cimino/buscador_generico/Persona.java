package com.cga.pro.investigacion.charly_cimino.buscador_generico;

public class Persona implements Identificable<Integer> {

    private Integer dni;
    private String nombre;
    private String apellido;

    public Persona(Integer dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString() {
        return "Persona( Dni: " + dni + ", " + nombre + " " + apellido + " )";
    }

    @Override
    public Integer getId() {
        return dni;
    }

    @Override
    public void setId(Integer x) {
        this.dni = x;
    }

    @Override
    public boolean sameId(Integer anotherId) {
        return this.dni.equals(anotherId) ;
    }
}
