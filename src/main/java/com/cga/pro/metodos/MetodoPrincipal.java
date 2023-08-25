package com.cga.pro.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MetodoPrincipal {

    public void saludo() {
        System.out.println("Hola!!!");
    }

    public String nombre(String nombre) {
        return nombre;
    }

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public double areaDelCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public void tablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%10d X %d = %d%n", numero, i, (numero * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MetodoPrincipal obj = new MetodoPrincipal();
        int isOK = 0;
        int n1 = 0, n2 = 0;

        obj.saludo();
        System.out.println(obj.nombre("Iván Rodríguez Saiz."));
        System.out.println();

        do {
            if (isOK == 0) {
                try {
                    System.out.print("Intoduzca el primer número: ");
                    n1 = sc.nextInt();
                    isOK++;
                } catch (InputMismatchException ex) {
                    System.out.println("ERROR: Debe teclear un número entero...");
                    sc.next();
                }
            }
            if (isOK == 1) {
                try {
                    System.out.print("Intoduzca el segundo número: ");
                    n2 = sc.nextInt();
                    isOK++;
                } catch (InputMismatchException ex) {
                    System.out.println("ERROR: Debe teclear un número entero...");
                    sc.next();
                } finally {
                    if (isOK == 2) {
                        int result = obj.sumar(n1, n2);
                        System.out.println("Resultado: " + result);
                        System.out.println("=======================================");
                        System.out.println();
                    }
                }
            }
        } while (isOK != 2);

        isOK = 0;
        double radio = 0;

        do {
            try {
                System.out.print("Intoduzca radio (r) del Circulo: ");
                radio = sc.nextDouble();
                isOK++;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR: Debe teclear un número entero...");
                sc.next();
            } finally {
                if (isOK == 1) {
                    System.out.printf("El área del Circulo de r(%.2f) es: %.2f%n", radio, obj.areaDelCirculo(radio));
                    System.out.println("=======================================");
                    System.out.println();
                }
            }
        } while (isOK < 1);

        isOK = 0;
        int numero = 0;

        do {
            try {
                System.out.print("Intoduzca número para su Tabla de Multiplicar: ");
                numero = sc.nextInt();
                isOK++;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR: Debe teclear un número entero...");
                sc.next();
            }
        } while (isOK < 1);

        obj.tablaMultiplicar(numero);

        sc.close();
    }
}
