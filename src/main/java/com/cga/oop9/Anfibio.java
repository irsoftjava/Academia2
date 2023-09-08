package com.cga.oop9;

public class Anfibio {

    private double tamanio;
    private double peso;
    private String color;

    public Anfibio() {
        this.tamanio = 0;
        this.peso = 0;
        this.color = null;
    }

    public Anfibio(double tamanio, double peso, String color) {
        this.tamanio = tamanio;
        this.peso = peso;
        this.color = color;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
