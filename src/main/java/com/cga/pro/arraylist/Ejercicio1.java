package com.cga.pro.arraylist;

// Escribe un programa que lea números enteros y los guarde en un ArrayList hasta que
// se lea un 0 y muestra los números leídos, su suma y su media.

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;
        int total = 0, cant = 0, media = 0;

        do {
            System.out.print("Introduzca un número entero: ");
            numero = sc.nextInt();

            if (numero != 0) {
                numeros.add(numero);
                total += numero;
                cant += 1;
            }
        } while (numero != 0);

        media = total / cant;
        System.out.println("Números Leídos: ");
        System.out.println(numeros);
        System.out.printf("Se introdujeron: %d números.%n", cant);
        System.out.printf("La media de los números introducidos es: %d%n", media);

        sc.close();
    }
}
