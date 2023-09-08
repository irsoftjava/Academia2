package com.cga.oop9;

public interface Animal extends Depredador, Presa {

    @Override
    default void cazar() {
        System.out.println("Estoy Cazando..");
    }

    @Override
    default void perseguir() {
        System.out.println("Te estoy persiguiendo.");
    }

    @Override
    default void observar() {
        System.out.println("Te estoy observando.");
    }

    @Override
    default void huir() {
        System.out.println("Corre que te como....");
    }
}
