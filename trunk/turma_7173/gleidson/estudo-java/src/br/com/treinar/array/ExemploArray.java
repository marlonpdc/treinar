package br.com.treinar.array;

import java.util.Scanner;

import br.com.treinar.estudo.Pessoa;

public class ExemploArray {

	public static void main(String[] args) {

		Pessoa[] pessoas = null;
		System.out.println();
		pessoas = new Pessoa[3];

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoa();
			System.out.print("Nome pessoa " + (i + 1) + ": ");
			pessoas[i].nome = sc.nextLine();
			System.out.print("Idade pessoa " + (i + 1) + ": ");
			pessoas[i].idade = sc.nextInt();
			sc.nextLine();
		}
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(pessoas[i]);
		}
		
		sc.close();

	}

}
