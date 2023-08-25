package com.cga.actividad4;

import java.util.Scanner;

// Actividad 4, Ejercicio 3
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indtroduzca el diámetrto de la Esfera: ");
		float diametro = sc.nextFloat();
		
		float radio = diametro / 2;
		
		System.out.println("El radio de la Esfera es: " + radio);
		
		sc.close();
	}

}
