package com.cga.pro.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        UtilesString us = new UtilesString();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un carácter: ");
        char caracter = sc.next().charAt(0);

        if (us.esVocal(caracter))
            System.out.println("El caracter es una VOCAL.");
        else
            System.out.println("El caracter NO es una VOCAL.");

        sc.close();
    }
}
