package com.cga.pro.investigacion.thread;

// La clase Hilo tiene que implementar la interfaz Runnable
// la interfaz es más o menos así:
//
// public interface Runnable {
//      public void run()
// }
public class Hilo implements Runnable {

    @Override
    public void run() {
        System.out.println("Hola desde el hilo...");
    }
}
