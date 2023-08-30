package com.cga.oop2;

import java.util.Calendar;

public class Aeropuerto {

    // Atributos
    private String nombre;
    private String pais;
    private String calle;
    private Integer numero;
    private String ciudad;
    private Integer anioInauguracion;
    private Integer capacidad;

    // Constructor vacío
    public Aeropuerto() {
    }

    // Constructor parametrizado
    public Aeropuerto(String nombre, String pais, String calle, Integer numero, String ciudad, Integer anioInauguracion, Integer capacidad) {
        this.nombre = nombre;
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
    }

    // Métodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getAnioInauguracion() {
        return anioInauguracion;
    }

    public void setAnioInauguracion(Integer anioInauguracion) {
        this.anioInauguracion = anioInauguracion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer aniosAbierto() {
        // Calendar fecha = new GregorianCalendar();
        // int anio = fecha.get(Calendar.YEAR);
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);

        return anioActual - this.anioInauguracion;
    }

    @Override
    public String toString() {
        return "Aeropuerto(" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", ciudad='" + ciudad + '\'' +
                ", anioInauguracion=" + anioInauguracion +
                ", capacidad=" + capacidad +
                ')';
    }
}
