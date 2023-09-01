package com.cga.oop4;

public class AsociacionPrueba {

    public static void main(String[] args) {

        // Creamos el objeto avion de tipo Avion
        Avion av1 = new Avion("Boeing 777", 500, 1800.0);
        Avion av2 = new Avion("Boeing 747", 450, 1500.0);
        Avion av3 = new Avion("Boeing 737", 300, 1300.0);
        Avion av4 = new Avion("AirBus A320", 300, 1200.0);
        Avion av5 = new Avion("AirBus A380-800", 480, 1600.0);

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

        ae1.agregarAvion(av1);
        ae1.agregarAvion(av2);
        ae1.agregarAvion(av3);
        ae1.agregarAvion(av4);
        ae1.agregarAvion(av5);

        System.out.println();
        ae1.mostrarAviones();
    }
}
