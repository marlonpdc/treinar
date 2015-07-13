package br.com.pandora.atividade;

import java.util.Scanner;


public class AtividadeEnum {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe uma opção ...");
		int opcao = leitor.nextInt();

		DiaSemana[] dias = DiaSemana.values();

		DiaSemana semana = dias[opcao];

		System.out.println(semana.getDescricao());
		
		leitor.close();
	}

}
