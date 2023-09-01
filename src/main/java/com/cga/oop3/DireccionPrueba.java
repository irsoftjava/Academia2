package com.cga.oop3;

public class DireccionPrueba {

    public static void main(String[] args) {

        Direccion direc = new Direccion("España", "Franco de Medina", 41, "La Cuesta");

        Aeropuerto aero1 = new Aeropuerto("Reina Sofia", direc, 1956, 880);
        Aeropuerto aero2 = new Aeropuerto("Reina Sofia", "España", "Franco de Medina",
                41, "La Cuesta", 1956, 880);

        System.out.println();
        System.out.println(aero1);
        System.out.println();
        System.out.println(aero2);
    }
}
