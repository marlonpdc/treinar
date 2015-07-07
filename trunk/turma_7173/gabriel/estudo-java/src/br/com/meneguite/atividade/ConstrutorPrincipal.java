package br.com.meneguite.atividade;

import java.util.Scanner;

public class ConstrutorPrincipal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		Construtor construtor = new Construtor();
		System.out.println("Informe o nome; ");
		construtor.nome = leitor.nextLine();
		System.out.println("Informe sua idade: ");
		construtor.idade = leitor.nextInt();

		System.out.println("Nome: " + construtor.nome + "\nIdade: "
				+ construtor.idade);

		leitor.close();
	}

}
