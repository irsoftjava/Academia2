package com.cga.pro.investigacion.sealed_class;

sealed class Human permits Anjali, Manish, Vartika {
    public void printName() {
        System.out.println("Default");
    }
}

non-sealed class Manish extends Human {
    public void printName() {
        System.out.println("Manish Sharma");
    }
}

non-sealed class Vartika extends Human {
    public void printName() {
        System.out.println("Vartika Dadheech");
    }
}

final class Anjali extends Human {
    public void printName() {
        System.out.println("Anjali Sharma");
    }
}

public class AppSealed {

    public static void main(String[] args) {

        Human h1 = new Anjali();
        Human h2 = new Vartika();
        Human h3 = new Anjali();

        h1.printName();
        h2.printName();
        h3.printName();
    }
}
