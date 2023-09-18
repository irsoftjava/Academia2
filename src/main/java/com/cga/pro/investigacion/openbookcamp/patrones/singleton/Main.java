package com.cga.pro.investigacion.openbookcamp.patrones.singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);
        System.out.println(singleton.getContador());
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        //singleton2.setContador(10);
        System.out.println(singleton2.getContador());
        System.out.println(singleton2);

        Aplicacion app = Aplicacion.getInstance();  // new Aplicacion()
        Aplicacion app2 = Aplicacion.getInstance(); // app2 = app

        app.Run();
        app2.Run();

        System.out.println(app + " " + app2);
    }
}
