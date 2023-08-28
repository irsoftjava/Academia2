package com.cga.pro.coche;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final String[] MARCAS = {"TOYOTA", "NISSAM", "SKODA", "RENAULT", "OPEL", "CITROEN"};
    public static final String[] MOD_TOY = {"COROLA", "YARIS", "ACCOR"};
    public static final String[] MOD_NIS = {"MICRA", "TIDA", "GTR"};
    public static final String[] MOD_SKO = {"FABIA", "KAROQ", "SCALA"};
    public static final String[] MOD_REN = {"DACIA", "DUSTER", "LOGAN"};
    public static final String[] MOD_OPE = {"ASTRA", "CORSA", "MOKKA"};
    public static final String[] MOD_CIT = {"C4", "C3", "C5"};
    static ArrayList<Coche> coches = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Métodos
    // ======================================================

    public static String generaMatricula() {
        String matricula;
        String letras = "BCDFGHJKLMNOPQRSTVWXYZ";

        matricula = String.valueOf(((int) (Math.random() * (9999 - 1000) + 1000)));
        String let = "";
        int Km = 0;

        for (int i = 0; i <= 2; i++) {
            int k = (int) (Math.random() * 22);
            let += letras.charAt(k);
        }
        matricula += " " + let;
        return matricula;
    }

    public static String generaMarca() {
        return MARCAS[(int) (Math.random() * 5)];
    }

    public static String generaModelo(String m) {
        int n = (int) (Math.random() * 2);
        String modelo = "";

        switch (m) {
            case "TOYOTA" -> modelo = MOD_TOY[n];
            case "NISSAM" -> modelo = MOD_NIS[n];
            case "SKODA" -> modelo = MOD_SKO[n];
            case "RENAULT" -> modelo = MOD_REN[n];
            case "OPEL" -> modelo = MOD_OPE[n];
            case "CITROEN" -> modelo = MOD_CIT[n];
        }

        return modelo;
    }

    public static int generaKilometros() {
        return (int) (Math.random() * (999999 - 1)) + 1;
    }

    public static void leerCoches() {
        String matricula;
        String marca;
        String modelo;
        int Km;

        // Variable auxiliar que contendrá la referencia a cada Coche nuevo.
        Coche aux;
        int N;

        do {
            System.out.print("Número de Coches?: ");
            N = sc.nextInt();
        } while (N < 0);

        sc.nextLine();

        // Lectura de Coches
        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.printf("Coche #%d: %n", i + 1);
            matricula = generaMatricula();
            System.out.printf("Matrícula: %s%n", matricula);
            marca = generaMarca();
            System.out.printf("Marca: %s%n", marca);
            modelo = generaModelo(marca);
            System.out.printf("Modelo: %s%n", modelo);
            Km = generaKilometros();
            System.out.printf("Kilómetros: %d%n", Km);

            aux = new Coche();

            // Se asigna valores a los atributos del nuevo objeto.
            aux.setMatricula(matricula);
            aux.setMarca(marca);
            aux.setModelo(modelo);
            aux.setKm(Km);

            // Se añade el objeto al ArrayList
            coches.add(aux);
        }
    }

    public static void mostrarCoches() {
        System.out.println();
        for (Coche coch : coches)
            System.out.println(coch);
    }

    // Método para mostrar los coches de una marca que se pide por teclado
    public static void mostrarPorMarca() {
        String marca;

        System.out.print("Introduce la Marca: ");
        marca = sc.nextLine().toUpperCase();

        System.out.printf("Coches de la Marca %s :%n", marca);

        for (Coche coch : coches)
            if (coch.getMarca().equalsIgnoreCase(marca))
                System.out.println(coch);
    }

    // Método para mostrar todos los coches con un número de Km inferior
    // al número de Km que se pide por teclado
    public static void mostrarPorKm() {
        int Km;
        int c = 0;

        System.out.print("Introduce número de kilómetros: ");
        Km = sc.nextInt();
        System.out.printf("Coches con menos de %d Km: %n", Km);
        for (Coche coch : coches)
            if (coch.getKm() < Km) {
                System.out.println(coch);
                c += 1;
            }

        if (c == 0) {
            System.out.printf("No existen Coches con menos de %d Km.", Km);
            System.out.println();
        }
    }

    // Método para mostrar los coches con mayor Km
    public static Coche mostrarMayorKm() {
        Coche mayor = coches.get(0);

        for (Coche coch : coches)
            if (coch.getKm() > mayor.getKm())
                mayor = coch;

        return mayor;
    }

    // Método que muestra los coches ordenados por numero de Km de menor a mayor
    public static void mostrarOrdenadosPorKm() {
        int i, j;
        Coche aux;

        System.out.println("Ordenados por Km...");
        System.out.println();

        for (i = 0; i < coches.size(); i++) {
            for (j = i + 1; j < coches.size(); j++) {
                if (coches.get(j).getKm() < coches.get(i).getKm()) {
                    aux = coches.get(j);
                    coches.set(j, coches.get(i));
                    coches.set(i, aux);
                }
            }
        }
        mostrarCoches();
    }

    public static void main(String[] args) {
        leerCoches();
        System.out.println("\nCoches Introducidos");
        System.out.println();
        mostrarCoches();
        System.out.println();
        mostrarPorMarca();
        System.out.println();
        mostrarPorKm();
        System.out.println("\nCoche con Mayor número de Km: " + mostrarMayorKm());
        mostrarOrdenadosPorKm();
    }
}
