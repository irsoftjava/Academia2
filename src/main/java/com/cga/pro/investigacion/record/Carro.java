package com.cga.pro.investigacion.record;

import java.util.ArrayList;
import java.util.List;

public record Carro(List<Producto> productos) {

    public Carro() {
        this(new ArrayList<>());
    }

    public int cantidad() {
        return productos.size();
    }

    public Double precio() {
        return productos.stream().mapToDouble(Producto::precio).sum();
    }
}
