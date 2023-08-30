package com.cga.oop1;

public class App {

    public static void main(String[] args) {

        Avion avion1 = new Avion();
        Avion avion2 = new Avion("Airbus A380", 500, 1185.0);

        avion1.setModelo("Boeing 747");
        avion1.setNumAsientos(300);
        avion1.setVelocidadMaxima(957.0);

        System.out.println("Avion #1: " + avion1);
        System.out.println("Avion #2: " + avion2);
        System.out.println();

        System.out.println("Avión #1");
        System.out.println("Modelo: " + avion1.getModelo());
        System.out.println("Número de Asientos: " + avion1.getNumAsientos());
        System.out.println("Velocidad Máxima: " + avion1.getVelocidadMaxima());
        System.out.println();

        System.out.println("Avión #2");
        System.out.println("Modelo: " + avion2.getModelo());
        System.out.println("Número de Asientos: " + avion2.getNumAsientos());
        System.out.println("Velocidad Máxima: " + avion2.getVelocidadMaxima());
    }
}
