package com.cga.oop7;

public abstract class Persona {

    // Atributos
    private String nombre;
    private double sueldo;

    // Constructor
    public Persona(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public abstract double incrementoDeSueldo(double aumento);

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
