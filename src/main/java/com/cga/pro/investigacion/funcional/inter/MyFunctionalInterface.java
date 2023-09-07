package com.cga.pro.investigacion.funcional.inter;

/**
 * Una Interface Funcional en Java tiene la particularidad que solo tiene un método.
 * No puede tener más de un método, porque son la base de las expresiones Lambdas.
 * Si yo quiero que el compilador verifique si cumplo con todas las reglas de la
 * programación funcional le puedo colocar la anotación @FunctionalInterface.
 */

@FunctionalInterface
public interface MyFunctionalInterface {
    String doSomeThing(String param);
}
