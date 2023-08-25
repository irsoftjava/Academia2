package com.cga.pro.metodos;

public class CalculadoraIMC {

    // Funcion que calcula el IMC
    public double calcularIMC(double pesoKg, double alturaMetros) {
        double imc = pesoKg / Math.pow(alturaMetros, 2);
        return imc;
    }
}
