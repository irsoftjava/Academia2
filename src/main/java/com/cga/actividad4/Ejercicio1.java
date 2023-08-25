package com.cga.actividad4;

import java.util.Scanner;

// Actividad 4, Ejercicio 1
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca los °C: ");
		float gradosCentigrados = sc.nextFloat();
		
		float gradosFahrenheit = ((gradosCentigrados * 9) / 5) + 32;
		
		System.out.println(gradosCentigrados + "°C equivalen a " + gradosFahrenheit + "°F");
		
		sc.close();
	}

}
