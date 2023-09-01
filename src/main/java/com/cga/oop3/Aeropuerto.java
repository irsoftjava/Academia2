package com.cga.oop3;

import java.time.LocalDate;

public class Aeropuerto {

    // Atributos
    private String nombre;
    private Direccion direccion;
    private Integer anioInauguracion;
    private Integer capacidad;

    // Constructor vacío
    public Aeropuerto() {
    }

    // Constructor parametrizado

    public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, Integer anioInauguracion, Integer capacidad) {
        this.nombre = nombre;
        this.direccion = new Direccion(pais, calle, numero, ciudad);
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
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
        // int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int anioActual = LocalDate.now().getYear();
        return anioActual - this.anioInauguracion;
    }
/*
    @Override
    public String toString() {
        return  "El Aeropuerto " + nombre + " se encuentra en " + pais + " en calle " + calle +
                " número " + numero + " en la Ciudad de " + ciudad + ". \nFue Inaugurado en el año " + anioInauguracion +
                " y cuenta con una Capacidad de " + capacidad + " personas. Lleva abierto " + this.aniosAbierto() + " años.";

    }*/
}
