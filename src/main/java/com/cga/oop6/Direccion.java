package com.cga.oop6;

public class Direccion {

    // Atributos
    private String pais;
    private String calle;
    private int numero;
    private String ciudad;

    // Constructor vacío
    public Direccion() {
    }


    // Constructor parametrizado
    public Direccion(String pais, String calle, int numero, String ciudad) {
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    // Métodos
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
/*
    @Override
    public String toString() {
        return "Direccion(" +
                "pais='" + pais + '\'' +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", ciudad='" + ciudad + '\'' +
                ')';
    }

 */
}
