package com.cga.hospital;

public class Persona {
    private int id;
    private String nombre;
    private String dni;
    private Direccion direccion;

    public Persona(int id, String nombre, String dni, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
