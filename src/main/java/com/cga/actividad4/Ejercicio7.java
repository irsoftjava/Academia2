package com.cga.actividad4;

import java.util.Scanner;

// Actividad 4, Ejercicio 7
public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		float num1 = sc.nextFloat();
		
		System.out.print("Introduzca el segundo número: ");
		float num2 = sc.nextFloat();
		
		System.out.print("Introduzca el tercer número: ");
		float num3 = sc.nextFloat();
		
		float media = (num1 + num2 + num3) / 3.0F;
		
		System.out.println("La media es: " + media);
		
		
		sc.close();
	}

}
