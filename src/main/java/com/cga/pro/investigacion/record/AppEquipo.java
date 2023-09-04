package com.cga.pro.investigacion.record;

public class AppEquipo {

    public static void main(String[] args) {

        Producto arroz = new Producto("Arroz", 1.59);
        Producto leche = new Producto("Leche", 0.85);

        Carro carro = new Carro();
        carro.productos().add(arroz);
        carro.productos().add(leche);
        System.out.println("Precio Total: " + carro.precio());

        carro.productos().clear();
        System.out.println("Precio Total: " + carro.precio());
    }
}
