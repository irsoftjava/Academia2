package com.cga.pro.matrix2d;

import java.util.Arrays;

public class Matrix {

    public static void miSort(int[] arr) {
        int len = arr.length;
        int swap;

        for (int i = 0; i < len - 1; i++)
            for (int j = i + 1; j < len; j++) {
                if (arr[i] >= arr[j]) {
                    continue;
                }
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
    }

    public static int sumatoriaFila(int [][] arr) {
        int ilen = arr.length;
        int jlen = arr[0].length;
        int sumatoria = 0;
        int pos = 0;
        int total = 0;

        for (int i = 0; i < ilen - 1; i++) {
            for (int j = 0; j < jlen; j++) sumatoria += arr[i][j];
            if (sumatoria <= total) {
                continue;
            }
            pos = i;
            total = sumatoria;
        }

        return pos;
    }

    public static void mostrarMatriz(int[][] mat) {
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.printf("%2d ", anInt);
            }
            System.out.println();
        }
    }

    public static void mostrarMatriz(String[][] mat) {
        for (String[] strings : mat) {
            for (String string : strings) {
                System.out.printf("%15s ", string);
            }
            System.out.println();
        }
    }

    public static String invertirString(String str) {
        StringBuilder strResultante = new StringBuilder(str);
        //for (int i = str.length() - 1; i >= 0; i--) strResultante.append(str.charAt(i));
        return strResultante.reverse().toString();
    }

    public static String[][] invertirMatriz(String[][] arr, boolean invText) {
        int ilen = arr.length;
        int jlen = arr[0].length;
        String str;
        String[][] matResultante = new String[ilen][jlen];

        int pi = 0;
        int pj;
        for (int i = ilen - 1; i >= 0; i--) {
            pj = 0;
            for (int j = jlen - 1; j >= 0; j--) {
                if (invText)
                    str = invertirString(arr[i][j]);
                else
                    str = arr[i][j];
                matResultante[pi][pj] = str;
                pj++;
            }
            pi++;
        }
        return matResultante;
    }

    public static void main(String[] args) {

        // Se crea una matriz de 4 filas y 3 columnas
        int f = 5;
        int c = 20;
        int iniAleat = 1;
        int finAleat = 80;
        int[][] a2d = new int[f][c];

        // Se carga la matriz
        System.out.println("Carga de valores en la Matriz...");

        // Random entre 10 y 100 = Math.random() * (100 - 10 + 1) + 10
        for (int i = 0; i < a2d.length; i++) {
            for (int j = 0; j < a2d[i].length; j++) {
                a2d[i][j] = (int) (Math.random() * finAleat + iniAleat );
            }
        }

        // Imprime la Matriz
        System.out.println();
        mostrarMatriz(a2d);

        // Mayor y Menor valor de la Matriz
        int numeroMayor = Integer.MIN_VALUE;
        String mayorPosicion = "";
        int numeroMenor = Integer.MAX_VALUE;
        String menorPosicion = "";
        for (int i = 0; i < f; i++)
            for (int j = 0; j < c; j++) {
                if (a2d[i][j] > numeroMayor) {
                    numeroMayor = a2d[i][j];
                    mayorPosicion = i + ", " + j;
                }
                if (a2d[i][j] < numeroMenor) {
                    numeroMenor = a2d[i][j];
                    menorPosicion = i + ", " + j;
                }
            }

        System.out.println();
        System.out.printf("Mayor valor de la Matriz: %d y se encuentra en la posición %s.%n", numeroMayor, mayorPosicion);
        System.out.printf("Menor valor de la Matriz: %d y se encuentra en la posición %s.%n", numeroMenor, menorPosicion);

        // 1.- Ordena de mayor a menor la primera fila y mostrarla.
        System.out.println();
        int[] fila;
        fila = Arrays.copyOf(a2d[0], c);
        miSort(fila);
        System.out.println("Primera fila ordenada de Mayor a Menor: " + Arrays.toString(fila));
        System.out.println();

        // 2.- Ordena de menor a mayor la segunda columna y mostrarla.
        int[] columna = new int[f];
        for (int i = 0; i < f; i++) {
            columna[i] = a2d[i][2];
        }
        Arrays.sort(columna);
        System.out.println("Segunda columna ordenada de Menor a Mayor: " + Arrays.toString(columna));
        System.out.println();

        // 3.- Calcular la fila que contenga la sumatoria maxima de la matriz y mostrarla.
        int mayorSumatoria = sumatoriaFila(a2d);
        System.out.println("Fila con Mayor Sumatoria: " + Arrays.toString(a2d[mayorSumatoria]));

        // 4.- Realizar una matriz de 4 x 3, cargarla con String y mostrar el orden inverso al que se ha introducido.
        System.out.println();
        String[][] matriz = {
                {"Perú","Liechtenstein","Cuba"},
                {"Honduras","Francia","Inglaterra"},
                {"Japon","Italia","Colombia"},
                {"Jamaica","Venezuela","China"}
        };
        System.out.println("Mostrando Matriz Original.");
        mostrarMatriz(matriz);

        System.out.println();
        System.out.println("Mostrando Matriz Invertida.");
        String[][] matrizInv = invertirMatriz(matriz, false);
        mostrarMatriz(matrizInv);
    }

}
