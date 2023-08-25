package com.cga.actividad4;

import java.util.Scanner;

// Actividad 4, Ejercicio 8
public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora Actual: ");
		int t = sc.nextInt();
		
		System.out.print("Cantidad de horas: ");
		int h = sc.nextInt();
		
		int horaFinal = (t + h) % 12;
		
		System.out.println("En " + h + " el reloj marcará las " + horaFinal);
		
		sc.close();
	}

}
