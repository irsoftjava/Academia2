package com.cga.oop6;

import java.time.LocalDate;

public class Aeropuerto {

    // Constantes
    private final int MAX_AVIONES = 5;
    private int avionNumero = 0;

    // Atributos
    private String nombre;
    private Direccion dir;
    private Avion[] aviones = new Avion[MAX_AVIONES];
    private Integer anioInauguracion;
    private Integer capacidad;


    // Constructores parametrizados
    public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, Integer anioInauguracion, Integer capacidad) {
        this.nombre = nombre;
        this.dir = new Direccion(pais, calle, numero, ciudad);
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
    }

    public Aeropuerto(String nombre, Direccion dir, Integer anioInauguracion, Integer capacidad) {
        this.nombre = nombre;
        this.dir = dir;
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
    }

    public Aeropuerto() {
    }

    // Métodos
    public int getNumeroDeAviones() {
        return avionNumero;
    }

    public Integer aniosAbierto() {
        /*
         Calendar fecha = new GregorianCalendar();
         int anio = fecha.get(Calendar.YEAR);
         int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        */
        int anioActual = LocalDate.now().getYear();
        return anioActual - this.anioInauguracion;
    }

    public void agregarAvion(Avion a) {
        if (this.getNumeroDeAviones() < MAX_AVIONES) {
            aviones[avionNumero] = a;
            avionNumero++;
        } else {
            System.out.println();
            System.out.printf("ERROR: Ya no se puede agregar mas Aviones, el máximo es %d\n", MAX_AVIONES);
        }
    }

    public void mostrarAviones() {
        for (Avion a : aviones) {
            System.out.println(a);
        }
    }

    @Override
    public String toString() {
        return "El " + nombre + " se encuentra en " + dir.getPais() + " en calle " + dir.getCalle() +
                " número " + dir.getNumero() + " en la Ciudad de " + dir.getCiudad() + ". \nFue Inaugurado en el año " + anioInauguracion +
                " y cuenta con una Capacidad de " + capacidad + " personas. Lleva abierto " + this.aniosAbierto() + " años.";

    }
}
