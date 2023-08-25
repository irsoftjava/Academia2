package com.cga.pro.metodos.factorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EjemploFactorial fact = new EjemploFactorial();

        long valor = 0;
        long result = 0;

        System.out.print("Introduzca un número: ");
        valor = sc.nextLong();

        result = fact.factorial(valor);
        System.out.printf("El factorial de %d es %d%n", valor, fact.factorial(valor));

        sc.close();
    }
}
