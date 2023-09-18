package com.cga.pro.investigacion.openbookcamp.patrones.factory;

public class PrecioFactory {
    Precio precioFactory;
    private PrecioFactory() {};

    public PrecioFactory(String pais) {
        if (pais.equalsIgnoreCase("España")) {
            System.out.println("España, precio en EUR");
            precioFactory = new PrecioEUR();
        } else {
            System.out.println("Otro país, precio en USD");
            precioFactory = new PrecioUSD();
        }
    }
}
