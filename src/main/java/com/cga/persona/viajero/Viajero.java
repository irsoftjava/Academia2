package com.cga.persona.viajero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Viajero extends Persona {

    static int cantViajeros = 0;
    private String nacionalidad;
    private Direccion direccion;

    // Constructor
    public Viajero(String nombre, String apellidos, String dni, String nacionalidad, Direccion direccion) {
        super(nombre, apellidos, dni);
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        cantViajeros++;
    }

    public Viajero(String nombre, String apellidos, String dni, String nacionalidad, String calle, int numero) {
        super(nombre, apellidos, dni);
        this.nacionalidad = nacionalidad;
        this.direccion = new Direccion(calle, numero);
        cantViajeros++;
    }

    private void Pausa() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String espera = br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getInfo(boolean pausado) {
        System.out.println();
        if (pausado) {
            System.out.printf("Nombre: %s", super.getNombre());
            Pausa();
            System.out.printf("Apellido: %s", super.getApellidos());
            Pausa();
            System.out.printf("DNI: %s", super.getDni());
            Pausa();
            System.out.printf("Nacionalidad: %s", this.nacionalidad);
            Pausa();
            System.out.printf("Dirección: %s", this.direccion);
        } else {
            System.out.printf("Nombre: %s\n", super.getNombre());
            System.out.printf("Apellido: %s\n", super.getApellidos());
            System.out.printf("DNI: %s\n", super.getDni());
            System.out.printf("Nacionalidad: %s\n", this.nacionalidad);
            System.out.printf("Dirección: %s\n", this.direccion);
        }
    }
}
