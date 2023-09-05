package com.cga.oop6;

public class AeropuertoPublico extends Aeropuerto {

    // Atributos
    private double financiacion;
    private int numeroTrabajadoresDiscapacitados;

    // Constructor vacío
    public AeropuertoPublico() {
        super();
    }

    public AeropuertoPublico(double financiacion, int numeroTrabajadoresDiscapacitados,
                             String nombre, Direccion dir, Integer anioInauguracion, Integer capacidad) {

        super(nombre, dir, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
    }

    public double getFinanciacion() {
        return financiacion;
    }

    public void setFinanciacion(double financiacion) {
        this.financiacion = financiacion;
    }

    public int getNumeroTrabajadoresDiscapacitados() {
        return numeroTrabajadoresDiscapacitados;
    }

    public void setNumeroTrabajadoresDiscapacitados(int numeroTrabajadoresDiscapacitados) {
        this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEs un Aeropuerto Publico que cuenta con una Financiación de " +
                financiacion + " y tiene " + numeroTrabajadoresDiscapacitados + " Trabajadores Discapacitados.";
    }
}
