package com.cga.actividad4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca los °F: ");
		float gradosFahrenheit = sc.nextFloat();
		
		float gradosCentigrados = ((gradosFahrenheit - 32) * 5) / 9;
		
		System.out.println(gradosFahrenheit + "°F equivalen a " + gradosCentigrados + "°C");
		
		sc.close();
	}

}
