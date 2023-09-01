package com.cga.oop4;

public class DireccionPrueba {

    public static void main(String[] args) {

        // Creamos el objeto direc de tipo Direccion
        Direccion direc = new Direccion("España", "Franco de Medina", 41, "La Cuesta");

        // Creamos los objetos aero1 y aero2 del tipo Aeropuerto
        Aeropuerto ae1 = new Aeropuerto("Reina Sofia", direc, 1956, 880);
        Aeropuerto ae2 = new Aeropuerto("Aeropuerto Norte", "España", "Carretera del Norte",
                41, "La Laguna", 1946, 850);

        System.out.println();
        System.out.println(ae1);
        System.out.println();
        System.out.println(ae2);
    }
}
