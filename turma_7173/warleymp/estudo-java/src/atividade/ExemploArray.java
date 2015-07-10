package atividade;

import java.util.Scanner;

public class ExemploArray {

	public static void main(String[] args) {

		Pessoa[] pessoas = null;
		System.out.println();
		pessoas = new Pessoa[7];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoa();
			System.out.println("Nome Pessoa: " + (i + 1 + ": "));
			pessoas[i].nome = sc.nextLine();
			System.out.println("Idade da Pessoa:" + (i + 1 + ": "));
			pessoas[i].idade = sc.nextInt();
			pessoas[i].cidade = sc.nextLine();
			System.out.println("Cidade da Pessoa:" + (i + 1 + ": "));
			pessoas[i].cidade = sc.nextLine();
		}
		for (int i = 0; i < pessoas.length; i++) {
//			System.out.println("Nome Pessoa: " + (i + 1 + pessoas[i].nome));
//			System.out.println("Idade da Pessoa:" + (i + 1 + pessoas[i].idade));
//			System.out.println("Cidade da Pessoa:" + (i + 1  + pessoas[i].cidade));
			System.out.println(pessoas[i]);
		}

		sc.close();
	}

}
