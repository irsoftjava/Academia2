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
    }
}
