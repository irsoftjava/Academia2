package com.cga.oop6;

public class AeropuertoPrivado extends Aeropuerto {

    private int numeroDeSocios;

    // Constructores
    public AeropuertoPrivado() {
        super();
    }

    public AeropuertoPrivado(int numeroDeSocios, String nombre, Direccion dir, Integer anioInauguracion, Integer capacidad) {
        super(nombre, dir, anioInauguracion, capacidad);
        this.numeroDeSocios = numeroDeSocios;
    }

    public int getNumeroDeSocios() {
        return numeroDeSocios;
    }

    public void setNumeroDeSocios(int numeroDeSocios) {
        this.numeroDeSocios = numeroDeSocios;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEs un Aeropuerto Privado y cuenta con " + numeroDeSocios + " Socios.";
    }
}
