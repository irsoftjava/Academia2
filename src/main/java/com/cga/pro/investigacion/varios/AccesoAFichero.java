package com.cga.pro.investigacion.varios;

import java.io.FileReader;
import java.io.IOException;

public class AccesoAFichero {

    static class LeerFichero {
        public void lee() {
            try {
                FileReader entrada = new FileReader(
                        "./src/main/java/com/cga/pro/investigacion/archivo.txt");

                //int c = entrada.read();
                int c = 0;

                while (c != -1) {
                    c = entrada.read();
                    char letra = (char) c;
                    System.out.printf("%c", letra);
                }

            } catch (IOException e) {
                System.out.println("Error: Archivo no encontrado...");
            }
        }
    }
    public static void main(String[] args) {

        LeerFichero accediendo = new LeerFichero();
        accediendo.lee();
    }
}
