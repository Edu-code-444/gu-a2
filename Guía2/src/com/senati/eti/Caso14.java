package com.senati.eti;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lista de carreras:");
		System.out.println("- Desarrollo de Software (DS)");
		System.out.println("- Redes y conectividad (RC)");
		System.out.println("- Diseño Gráfico (DG)");

		float monto = 0, desc = 0;
		
		System.out.print("\nIngrese carrera (en siglas): ");
		String crra  = sc.nextLine();
		
		System.out.print("\nIngrese turno [M/T/N]: ");
		String trn  = sc.nextLine();
		
		if (crra.equals("DS") || crra.equals("ds")) {
			crra = "Desarrollo de Software";
			monto = 1500;
		}

		else if (crra.equals("RC") || crra.equals("rc")) {
			crra = "Redes y conectividad";
			monto = 1400;
		}

		else if (crra.equals("DG") || crra.equals("dg")) {
			crra = "Diseño Gráfico";
			monto = 1300;
		}
		
		else {
			crra = "No especificada";
			monto = 0;
		}
		
		if (trn.equals("M") || trn.equals("m")) {
			desc = (float) (monto * 0.1);
			trn = "Mañana";
		}

		else if (trn.equals("T") || trn.equals("t")) {
			desc = (float) (monto * 0.2);
			trn = "Tarde";
		}

		else if (trn.equals("N") || trn.equals("n")) {
			desc = (float) (monto * 0.15);
			trn = "Noche";
		}
		
		else {
			trn = "Turno no especificado";
			desc = monto;
		}
		
		
		System.out.println("\n... Resultados ...");
		System.out.println("Carrera....: " + crra);
		System.out.println("Monto......: " + monto);
		System.out.println("Turno......: " + trn);
		System.out.println("Descuento..: " + desc);
		System.out.println("Total......: " + (monto-desc));
		System.out.println("          $: " + ((monto-desc)/3.33f));
		
		

	}

}
