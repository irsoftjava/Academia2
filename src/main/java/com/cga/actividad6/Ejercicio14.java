package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        String[] numerosTexto = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};

        Scanner sc = new Scanner(System.in);
        int numero = 0;


        do {
            System.out.print("Introduzca un número, por favor:  ");
            numero = sc.nextInt();
        } while (numero < 0 || numero > 10);

        System.out.printf("El valor %d en Texto a %s", numero, numerosTexto[numero]);

        sc.close();
    }
}
