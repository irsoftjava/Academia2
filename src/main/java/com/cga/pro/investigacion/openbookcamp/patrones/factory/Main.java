package com.cga.pro.investigacion.openbookcamp.patrones.factory;

public class Main {

    public static void main(String[] args) {

        PrecioFactory precio = new PrecioFactory("españa");
        System.out.println(precio.precioFactory.getPrecio());

        PrecioFactory precio2 = new PrecioFactory("usa");
        System.out.println(precio2.precioFactory.getPrecio());
    }
}
