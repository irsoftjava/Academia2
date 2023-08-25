package com.cga.pro.investigacion;

public class EjemploTipos {

	public enum Dias {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo}
	
	public static void main(String[] args) {

		byte bbyte = Byte.MAX_VALUE;
        short corto = Short.MAX_VALUE;
        int entero = Integer.MAX_VALUE;
        long elargo = Long.MAX_VALUE;

        float f32 = Float.MAX_VALUE;
        double f64 = Double.MAX_VALUE;
        boolean bool = Boolean.TRUE;
        char letra = 'a';

        String lenguaje = "Java";

        System.out.println("byte: " + bbyte);
        System.out.println("short: " + corto);
        System.out.println("int: " + entero);
        System.out.println("long: " + elargo);
        System.out.println("float: " + f32);
        System.out.println("double: " + f64);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + letra);
        System.out.println("String: " + lenguaje);

        Dias dia = Dias.Viernes;
        System.out.println(dia.ordinal());

        for (Dias d : Dias.values())
            System.out.println(d);

        String texto = "Juan dijo: \"Hoy hace un día fantástico..\"";
        System.out.println(texto);

        String mensaje = String.format("byte: %d", bbyte);
        System.out.println(mensaje);

        System.out.println(String.format("short: %d", corto));
        System.out.println(String.format("float: %5.4f", f32));
	}

}
