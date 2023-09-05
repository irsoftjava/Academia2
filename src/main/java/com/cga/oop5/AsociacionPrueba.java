package com.cga.oop5;

import com.cga.oop4.Aeropuerto;
import com.cga.oop4.Avion;
import com.cga.oop4.Direccion;

public class AsociacionPrueba {

    public static void main(String[] args) {

        // Creamos el objeto avion de tipo Avion
        com.cga.oop4.Avion av1 = new com.cga.oop4.Avion("Boeing 777", 500, 1800.0);
        com.cga.oop4.Avion av2 = new com.cga.oop4.Avion("Boeing 747", 450, 1500.0);
        com.cga.oop4.Avion av3 = new com.cga.oop4.Avion("Boeing 737", 300, 1300.0);
        com.cga.oop4.Avion av4 = new com.cga.oop4.Avion("AirBus A320", 300, 1200.0);
        com.cga.oop4.Avion av5 = new Avion("AirBus A380-800", 480, 1600.0);

        // Creamos el objeto direc de tipo Direccion
        com.cga.oop4.Direccion direc = new Direccion("España", "Franco de Medina", 41, "La Cuesta");

        // Creamos los objetos aero1 y aero2 del tipo Aeropuerto
        com.cga.oop4.Aeropuerto ae1 = new com.cga.oop4.Aeropuerto("Reina Sofia", direc, 1956, 880);
        com.cga.oop4.Aeropuerto ae2 = new Aeropuerto("Aeropuerto Norte", "España", "Carretera del Norte",
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
