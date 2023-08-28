package com.cga.pro.metodos;

public class Cilindro {

    // Método para el calculo del Area y el Volumen de un Cilindro
    // Parámetros: r - radio, h - altura
    public void calculaAreaVolumenCilindro(int op, double r, double h) {
        switch (op) {
            case 1 -> {
                double respuesta = (Math.PI * 2 * r * (h + r));
                System.out.printf("El Área del Cilindro con r=%.2f y h=%.2f es: %.2f%n", r, h, respuesta);
            }
            case 2 -> {
                double respuesta = (Math.PI * Math.pow(r, 2) * h);
                System.out.printf("El Volumen del Cilindro con r=%.2f y h=%.2f es: %.2f%n", r, h, respuesta);
            }
        }
    }
}
