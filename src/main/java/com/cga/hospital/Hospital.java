package com.cga.hospital;

import java.util.ArrayList;

public class Hospital {

    private String nombre;
    private Direccion direccion;
    private ArrayList<Persona> personal;

    public Hospital(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        personal = new ArrayList<>();
    }

    public void add(Persona p) {
        personal.add(p);
    }

    public void showPersonal() {
        System.out.println();
        if (!personal.isEmpty()) {
            for (Persona p : personal) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        System.out.println();
        return "Hospital: " + this.nombre + " Dirección: " + this.direccion;
    }
}
