package com.cga.pro.metodos;

public class Ejercicio7 {

    public static void main(String[] args) {

        UtilesMath um = new UtilesMath();

        boolean primo = um.esPrimo(5);

        if (primo)
            System.out.println("El número es PRIMO");
        else
            System.out.println("El número NO es PRIMO");
    }
}
