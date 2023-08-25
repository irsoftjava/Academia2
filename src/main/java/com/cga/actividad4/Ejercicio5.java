package com.cga.actividad4;

import java.util.Scanner;

// Actividad 4, Ejercicio 5
public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el radio del circulo: ");
		float radio = sc.nextFloat();
		
		float area = 3.141592F * ( radio * radio);
		
		System.out.println("El área correspondiente al circulo es de: " + area);
		
		sc.close();
	}

}
