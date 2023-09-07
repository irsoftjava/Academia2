package com.cga.oop7;

public class Supervisor extends Persona {

    // Constructor
    public Supervisor(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    // Métodos
    @Override
    public double incrementoDeSueldo() {
        return this.getSueldo() * 1.25;
    }
}
