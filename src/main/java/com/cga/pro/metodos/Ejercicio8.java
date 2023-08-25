package com.cga.pro.metodos;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        UtilesMath um = new UtilesMath();
        Scanner sc = new Scanner(System.in);

        int n = 5;
        System.out.printf("%d tiene %d divisores Primos.", n, um.divisoresPrimos(n));

        sc.close();
    }
}
