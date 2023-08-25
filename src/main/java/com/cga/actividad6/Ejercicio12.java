package com.cga.actividad6;

import javax.swing.*;

public class Ejercicio12 {

    public static void main(String[] args) {

        double manzanasPrimerSemestre = Double.parseDouble(JOptionPane.showInputDialog("Introduzca las ventas en (kg) de Manzanas en el Primer Semestre"));
        double manzanasSegundoSemestre = Double.parseDouble(JOptionPane.showInputDialog("Introduzca las ventas en (kg) de Manzanas en el Segundo Semestre"));
        double perasPrimerSemestre = Double.parseDouble(JOptionPane.showInputDialog("Introduzca las ventas en (kg) de Peras en el Primer Semestre"));
        double perasSegundoSemestre = Double.parseDouble(JOptionPane.showInputDialog("Introduzca las ventas en (kg) de Peras en el Segundo Semestre"));

        double manzanasTotalKg = manzanasPrimerSemestre + manzanasSegundoSemestre;
        double perasTotalKg = perasPrimerSemestre + perasSegundoSemestre;

        double importeDeManzanas = manzanasTotalKg * 2.35;
        double importeDePeras = perasTotalKg * 1.95;

        System.out.printf("Total de Manzanas en el año %.2f, con un importe de %.2f%n", manzanasTotalKg, importeDeManzanas);
        System.out.printf("Total de Peras en el año %.2f, con un importe de %.2f%n", perasTotalKg, importeDePeras);
        System.out.printf("Importe total del Año %.2f%n", importeDeManzanas + importeDePeras);
    }
}
