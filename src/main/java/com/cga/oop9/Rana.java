package com.cga.oop9;

public class Rana extends Anfibio implements Animal {

    private String especie;
    private boolean venenosa;


    @Override
    public void cazar() {
        System.out.println("Estoy Cazando..");
    }

    @Override
    public void perseguir() {
        System.out.println("Te estoy persiguiendo.");
    }

    @Override
    public void observar() {
        System.out.println("Te estoy observando.");
    }

    @Override
    public void huir() {
        System.out.println("Corre que te como....");
    }
}
