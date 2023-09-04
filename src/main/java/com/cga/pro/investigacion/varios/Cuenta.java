package com.cga.pro.investigacion.varios;

public record Cuenta(String nombre, String clave, boolean privilegiada) {

    public Cuenta(String nombre, String clave) {
        this(nombre, clave, false);
    }

    public String identificador() {
        return "@" + this.nombre;
    }

    public void tienePrivilegios() {
        if (this.privilegiada)
            System.out.println("Tiene privilegios...");
        else
            System.out.println("Es regular...");
    }
}
