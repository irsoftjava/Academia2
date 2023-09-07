package com.cga.oop7;

public class Empleado extends Persona {

    public Empleado(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public double incrementoDeSueldo(double aumento) {
        return this.getSueldo() + (this.getSueldo() * (aumento / 100));
    }
}
