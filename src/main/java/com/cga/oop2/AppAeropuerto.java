package com.cga.oop2;

public class AppAeropuerto {

    public static void main(String[] args) {

        Aeropuerto ae1 = new Aeropuerto("Ciudad de la Laguna", "España",
                "Carretera del Norte", 210, "San Cristóbal de la Laguna",
                1946, 876);


        System.out.println(ae1);
        System.out.println("El Aeropuerto, " + ae1.getNombre() + " tiene " + ae1.aniosAbierto() + " años abierto.");
    }
}
