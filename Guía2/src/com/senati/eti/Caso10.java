package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0000");
		
		System.out.print("Empleado.........: ");
		String nom_emp = sc.nextLine();
		
		System.out.print("Horas trabajas...: ");
		float hor_tra = sc.nextFloat();
		
		System.out.print("Tarifa por hora..: ");
		float tari_hora = sc.nextFloat();

		System.out.print("Minutos tardados.: ");
		int min_tar = sc.nextInt();
	
		float bono = 0, tar = 0;
		float imp1 = (hor_tra * tari_hora);
		
		
		if (hor_tra > 60) 
			bono = imp1 * 0.13f;
		else
			bono = (hor_tra * tari_hora) * 0.04f;
			
		
		if (min_tar > 15)
			tar = (hor_tra * tari_hora) * 0.003f;

		System.out.println("\n\n=========== Resultados ============");
		System.out.println("Empleado............: " + nom_emp);
		System.out.println("Horas trabajadas....: " + hor_tra);
		System.out.println("Tarifa por hora.....: " + tari_hora);
		System.out.println("Importe.............: " + imp1);
		System.out.println("Bono................: " + bono);
		System.out.println("Descuento...........: " + tar);
		System.out.println("Meta alcanzada......: " + df.format((hor_tra/70)*100 + "%"));
	}

}
