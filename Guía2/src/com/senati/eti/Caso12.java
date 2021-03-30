package com.senati.eti;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Empleado....: ");
		String nombre = sc.nextLine();
		
		System.out.print("Nivel [1-4].: ");
		int nivel = sc.nextInt();
		
		System.out.print("Sueldo......: ");
		float sueldo = sc.nextFloat();
		
		float inc = 0;
		
		switch (nivel) {
			case 1:
				inc = 0.045f;
				break;
			case 2:
				inc = 0.06f;
				break;
			case 3:
				inc = 0.085f;
				break;
			case 4:
				inc = 0.11f;
				break;
			default:
				inc = 0f;
				break;
		}
		
		System.out.println("---------------------");
		System.out.println("      Resultados");
		System.out.println("---------------------");
		System.out.println("Empleado: "+ nombre);
		System.out.println("Nivel: "+ nivel);
		System.out.println("Sueldo: "+ sueldo);
		System.out.println("Incremento: "+ (100*inc) + "%");
		System.out.println("Nuevo sueldo: "+ ((sueldo*inc)+sueldo));
		

	}

}
