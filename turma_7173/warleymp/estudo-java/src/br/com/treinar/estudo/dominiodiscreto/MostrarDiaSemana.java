package br.com.treinar.estudo.dominiodiscreto;

import java.util.Scanner;

public class MostrarDiaSemana {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values();
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o numero do dia: ");
		Integer numdias = sc.nextInt();

		System.out.println(DiaSemana.recuperarDiaPorOrdinal(numdias));
		
		//System.out.println(dias[numdias]);
		
		
        sc.close();
	}
	
}