package com.senati.eti;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String opera = "", continuar = "S";
		float resu = 0;
		
		while(continuar.equals("S") || continuar.equals("s")) {
			System.out.print("Primer número.....: ");
			float pn = sc.nextInt();
			
			System.out.print("Segundo número....: ");
			float sn = sc.nextInt();
			
			System.out.print("Operación [1-6]...: ");
			int op = sc.nextInt();
			
			if (op == 1) {
				opera = "Suma";
				resu =(int) (pn + sn);
			}
			
			else if (op == 2) {
				opera = "Resta";
				resu = (int) (pn - sn);
			}

			else if (op == 3) {
				opera = "Producto";
				resu = pn * sn;
			}

			else if (op == 4) {
				resu = 0; 
				if (pn == 0 || sn == 0) {
					opera = "No es posible hayar división";
					resu = 0;
				}
				else {
					opera = "División";
					resu = pn / sn;
				}
			}

			else if (op == 5) {
				if (pn == 0 || sn == 0) {
					opera = "No es posible hayar el resto entero";
					resu = 0;
				}
				else {
					opera = "Resto entero";
					resu = (int) pn % sn;
				}
			}
			
			else if (op == 6) {
				opera = "Promedio";
				resu = (pn+sn)/2;
			}
			
			else {
				opera = "Parámetro no especificado.";
				resu = 0;
			}
			
			System.out.println("\n... Resultados ...");
			System.out.println("Número 1.......: " + pn);
			System.out.println("Número 2.......: " + sn);
			System.out.println("Operación......: " + opera);
			System.out.println("Resultado......: " + resu);
			
			sc.nextLine();
			
			System.out.print("\n¿Desea continuar? <S/N>: ");
			continuar = sc.nextLine();
		}
		
		

	}

}
