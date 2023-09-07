package com.cga.oop7;

public class Empleado extends Persona {

    public Empleado(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public double incrementoDeSueldo() {
        return this.getSueldo() * 4.30;
    }
}
