package com.senati.eti;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lista de productos:          Formas de pago:");
		System.out.println("- Tablet (TB)                - Contado [C1]");
		System.out.println("- Laptop (LT)                - Crédito [C2]");
		System.out.println("- Monitor (MN)");
		System.out.println("- Impresora (IM)");
		
		System.out.print("\nIngrese nombre....: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese producto..: ");
		String pro = sc.nextLine();
		
		System.out.print("Ingrese cantidad..: ");
		int canti = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("\nIngrese forma de pago [C1/C2]..: ");
		String fp = sc.nextLine();
		
		float desc = 0, monto = 0, total = 0, fto = 0;
		
		if (pro.equals("TB") || pro.equals("tb")) {
			pro = "Tablet";
			monto = 350;
		}

		else if (pro.equals("LT") || pro.equals("lt")) {
			pro = "Laptop";
			monto = 2300;
		}

		else if (pro.equals("mn") || pro.equals("MN")) {
			pro = "Monitor";
			monto = 850;
		}

		else if (pro.equals("IM") || pro.equals("im")) {
			pro = "Impresora";
			monto = 680;
		}
		
		else {
			pro = "No especificada";
			monto = 0;
		}
		
		total = monto * canti;
		
		if (fp.equals("C1") || fp.equals("c1")) {
			desc = (float) (total * 0.05);
			fp = "Forma de pago.: Contado\nDescuento.....: ";
			fto = total - desc;
			
		}

		else if (fp.equals("C2") || fp.equals("c2")) {
			desc = (float) (total * 0.12);
			fp = "Forma de pago.: Crédito\nAumento.......: ";
			fto = total + desc;
		}
		
		else {
			fp = "Pago no especificado";
			desc = total;
		}
		
		
		

		System.out.println("\n... R E S U M E N ...");
		System.out.println("Cliente.......: " + nombre);
		System.out.println("Producto......: " + pro);
		System.out.println("Cantidad......: " + canti);
		System.out.println("Precio........: " + monto);
		System.out.println("Total.........: " + total);
		System.out.println(fp + desc);
		System.out.println("A pagar.......: " + fto);
	}

}
