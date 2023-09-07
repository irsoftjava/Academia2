package com.cga.pro.investigacion.funcional;

import com.cga.pro.investigacion.funcional.inter.MyFunctionalInterface;

public class Tux implements MyFunctionalInterface  {
    @Override
    public String doSomeThing(String param) {

        return "Hola soy Tux, y recibí el siguiente parámetro: " + param;
    }
}
