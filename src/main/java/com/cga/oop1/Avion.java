package com.cga.oop1;

public class Avion {

    // Atributos
    private String modelo;
    private Integer numAsientos;
    private Double velocidadMaxima;

    // Constructores vacío
    public Avion() {
        this.modelo = "";
        this.numAsientos = 0;
        this.velocidadMaxima = 0.0;
    }

    // Constructor parametrizado
    public Avion(String modelo, Integer numAsientos, Double velocidadMax) {
        this.modelo = modelo;
        this.numAsientos = numAsientos;
        this.velocidadMaxima = velocidadMax;
    }

    // Métodos
    public String getModelo() {
        return modelo;
    }

    public Integer getNumAsientos() {
        return numAsientos;
    }

    public Double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumAsientos(Integer numAsientos) {
        this.numAsientos = numAsientos;
    }

    public void setVelocidadMaxima(Double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Avion(" +
                "modelo='" + modelo + '\'' +
                ", numAsientos=" + numAsientos +
                ", velocidadMaxima=" + velocidadMaxima +
                ')';
    }
}
