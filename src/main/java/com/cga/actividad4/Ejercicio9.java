package com.cga.actividad4;

import java.util.Scanner;

// Actividad 4, Ejercicio 9
public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un número real: ");
		float real = sc.nextFloat();
		
		float frac = (real - (int)real);
		
		if (frac < 0) {
			frac += -(frac * 2); 
		}
		
		System.out.println("La parte fraccionaria de " + real + " es " + frac);
		
		sc.close();
	}

}
