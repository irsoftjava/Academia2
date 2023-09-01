package com.cga.oop3;

public class DireccionPrueba {

    public static void main(String[] args) {

        Direccion direc = new Direccion("España", "Franco de Medina", 41, "La Cuesta");

        Aeropuerto aeropuerto = new Aeropuerto("Reina Sofia", direc, 1956, 880);

        System.out.println(aeropuerto);
    }
}
