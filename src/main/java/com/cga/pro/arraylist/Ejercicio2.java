package com.cga.pro.arraylist;

// Método que recibe un ArrayList de String y lo modifica invirtiendo su contenido.

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

    public static void recibeArrayList(ArrayList<String> arr) {
        Collections.reverse(arr);
    }

    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("numero");
        palabras.add("valores");
        palabras.add("entero");
        palabras.add("introduzca");
        palabras.add("negativo");
        palabras.add("dependencia");
        palabras.add("repositorio");

        System.out.println("Antes:");
        System.out.println(palabras);

        recibeArrayList(palabras);
        System.out.println("Después:");
        System.out.println(palabras);
    }
}
