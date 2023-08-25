package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        Scanner sc = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.print("Introduzca un número entre 1 y 7: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 7);

        System.out.printf("El %d corresponde al %s", numero, diasSemana[numero-1]);
    }
}
