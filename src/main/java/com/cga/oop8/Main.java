package com.cga.oop8;

public class Main {

    public static void main(String[] args) {

        Elipse el = new Elipse(5, 2);

        System.out.printf("El area de la Elipse: %.2f\n", el.area());
        System.out.printf("El perimetro de la Elipse: %.2f\n", el.perimetro());
    }
}
