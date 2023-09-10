package com.cga.pro.investigacion.latincoder.clases_abstractas;
public class Main {

    public static void main(String[] args) {

        Animal p = new Perro();
        p.comer();
        p.moverse();

        Animal a = new Ave();
        a.comer();
        a.moverse();
    }
}
