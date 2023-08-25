package com.cga.pro.metodos.factorial;

public class EjemploFactorial {

    public long factorial(long numero) {

        if (numero <= 1) {
            return 1;
        }

        return numero * factorial(numero - 1);
    }
}
