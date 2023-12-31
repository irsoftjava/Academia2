package com.cga.pro.coche;

public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private int km;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche(" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + km +
                ')';
    }

    public int getKm() {
        return this.km;
    }

    public void setKm(int km) {
        this.km = km;
    }

}
