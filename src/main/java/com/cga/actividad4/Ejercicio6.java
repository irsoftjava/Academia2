package com.cga.actividad4;

import java.util.Scanner;

// Actividad 4, Ejercicio 6
public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cuantos Euros desea convertir a Dolares: ");
		float euros = sc.nextFloat();
		
		float dolares = (euros / 1.1757F);
		
		System.out.println(euros + "€ equivalen a $" + dolares);
		
		sc.close();
	}

}
