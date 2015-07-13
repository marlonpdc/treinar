package br.com.treinar.estudo.dominiodiscreto;

import java.util.Scanner;

public class Atividade {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (DiaSemana dia : DiaSemana.values()) {
			System.out.println("\t" + dia);
		}
		System.out.print("Informe o dia da Semana: ");		
		String diaStr = sc.nextLine();
		DiaSemana diaEscolhido = DiaSemana.valueOf(diaStr);
		
		switch (diaEscolhido) {
		case SEGUNDA_FEIRA:
			System.out.println("trabalhar");
			break;
		case TERCA_FEIRA:
			System.out.println("trabalhar");
			
			break;
		case QUARTA_FEIRA:
			System.out.println("trabalhar");
			
			break;
		case QUINTA_FEIRA:
			System.out.println("trabalhar");
			
			break;
		case SEXTA_FEIRA:
			System.out.println("trabalhar");
			
			break;
		case SABADO:
			System.out.println("Ficar atoa");
			
			break;
		case DOMINGO:
			System.out.println("Ficar atoa");
			
			break;

		default:
			System.out.println("OPCAO INVALIDA");
			break;
		}
	}
	
	
}
