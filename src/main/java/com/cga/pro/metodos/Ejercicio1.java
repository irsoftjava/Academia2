package com.cga.pro.metodos;

public class Ejercicio1 {

    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d .- <<Eco...>>%n", i + 1);
        }
    }

    public static void main(String[] args) {

        Ejercicio1.eco(10);
    }
}
