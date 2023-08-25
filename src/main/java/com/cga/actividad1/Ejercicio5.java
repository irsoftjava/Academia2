package com.cga.actividad1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        // creamos el lector, una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // solicitamos que introduzca el precio del articulo
        System.out.print("Introduzca el precio del articulo: ");
        // y lo almacenamos en la variable (precioArticulo)
        double precioArticulo = sc.nextDouble();

        // solicitamos que introduzca la cantidad
        System.out.print("Introduzca la cantidad: ");
        // y la almacenamos en la variable (cantidad)
        double cantidad = sc.nextDouble();

        // multiplicamos la cantidad * precioArticulo
        double importe = cantidad * precioArticulo;
        double diezPorciento = (importe * 10) / 100;

        System.out.println("El abonado debe pagar " + importe + " menos el 10% " + diezPorciento + " es igual a: " + (importe - diezPorciento));

        sc.close();
    }
}
