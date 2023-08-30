package com.cga.pro.arraylist;

public class Cliente {
    private final String nombre;
    private final String apellidos;
    private final String dni;
    private final int edad;
    private final String calle;
    private final int numero;
    private final int cp;
    private final String provincia;

    public Cliente(String nombre, String apellidos, String dni, int edad, String calle, int numero, int cp, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        String msg = String.format("%15s %15s, DNI: %9s, Edad: %3d, Calle: %20s, Nº %3d, CP: %5d, %15s", this.nombre, this.apellidos, this.dni,
                this.edad, this.calle, this.numero, this.cp, this.provincia);
        return "Cliente(" + msg + ")";
    }
}
