package com.cga.pro.arraylist;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private String calle;
    private int numero;
    private int cp;
    private String provincia;

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

}
