package com.cga.actividad7;

public class DelegacionIntentar {

    public static void main(String[] args) {

        boolean fueradelimites = true;
        int i;
        String texto[] = {"Uno", "Dos", "Tres", "Cuatro", "Cinco"};

        while (fueradelimites) {
            try {
                i = (int)Math.round(Math.random() * 9);
                System.out.println("posicion: " + i);
                System.out.println(texto[i]);
                fueradelimites = false;
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Fallo en el Indice.");
            }
        }
    }
}
