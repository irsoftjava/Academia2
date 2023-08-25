package com.cga.pro.metodos;

public class Ejercicio5 {

    public static void main(String[] args) {

        UtilesString us = new UtilesString();

        boolean resp = us.esVocal('6');
        if (resp)
            System.out.println("El caracter es una VOCAL.");
        else
            System.out.println("El caracter NO es una VOCAL.");
    }
}
