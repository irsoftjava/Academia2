package com.cga.pro.investigacion.sealed_class;

public sealed class HumanClass permits Men, Women {

    private final String name;
    private final int edad;

    public HumanClass(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "HumanClass{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }
}
