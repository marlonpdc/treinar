package br.com.treinar.atividade;

import java.util.Scanner;

import br.com.treinar.estudo.dominiodiscreto.DiaSemana;

public class AtividadeEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Opção: ");
		Integer opcao = sc.nextInt();

		System.out.println(DiaSemana.recuperarDiaPorOrdinal(opcao));
		
		
		sc.close();
		
	}
	
}
