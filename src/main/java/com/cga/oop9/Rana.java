package com.cga.oop9;

public class Rana extends Anfibio implements Animal {

    private String especie;
    private boolean venenosa;


    public Rana() {
    }

    public Rana(double tamanio, double peso, String color, String especie, boolean venenosa) {
        super(tamanio, peso, color);
        this.especie = especie;
        this.venenosa = venenosa;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }


    //
//    @Override
//    public void cazar() {
//        System.out.println("Estoy Cazando..");
//    }
//
//    @Override
//    public void perseguir() {
//        System.out.println("Te estoy persiguiendo.");
//    }
//
//    @Override
//    public void observar() {
//        System.out.println("Te estoy observando.");
//    }
//
//    @Override
//    public void huir() {
//        System.out.println("Corre que te como....");
//    }
}
