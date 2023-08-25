package com.cga.pro.investigacion;

public record Registro(String name, int age) {

    public boolean mayorDeEdad() {
        return (this.age > 18);
    }
}
