package com.cga.pro.metodos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static double myNaN = 0.0d / 0.0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.UK);
        CalculadoraIMC imc = new CalculadoraIMC();

        System.out.print("Introduzca el peso en Kg: ");
        double peso = sc.nextDouble();

        System.out.print("Introduzca la altura en m: ");
        double altura = sc.nextDouble();

        System.out.println("Su Indice de Masa Corporal es: " + imc.calcularIMC(peso, altura));

        sc.close();
    }
}
