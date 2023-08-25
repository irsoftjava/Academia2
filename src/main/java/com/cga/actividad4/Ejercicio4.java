package com.cga.actividad4;

import java.util.Scanner;

// Actividad 4, Ejercicio 4
public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca su peso en (kg): ");
		float pesoKg = sc.nextFloat();
		
		System.out.print("Introduzca su altura en (m): ");
		float altura = sc.nextFloat();
		
		float imc = pesoKg / (altura * altura);
		
				
		System.out.println("Su Indice de Masa Corporal es igual a " + imc);
		
		
		if ((imc >= 18.0) && (imc <= 25)) {
			System.out.println("Su Indice de Masa Corporal está dentro de los parámetros establecidos.");
		} else if (imc < 18.0) {
			System.out.println("Su Indice de Masa Corporal está por debajo de los parámetros establecidos.");
		} else if (imc > 25.0) {
			System.out.println("Su Indice de Masa Corporal está por encima de los parámetros establecidos.");
		}
		
		sc.close();
	}

}
