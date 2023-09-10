package com.cga.pro.investigacion.charly_cimino.buscador_generico;

public interface Identificable<T> {
    T getId();
    void setId(T x);

    boolean sameId(T anotherId);
}
