package array;

import java.util.Scanner;

import Encapsulamento.Pessoa;

public class ExemploArray {
	public static void main(String[] args) {

		Pessoa[] pessoas = new Pessoa[1];

		Scanner sc = new Scanner(System.in);

		/*
		 * pessoas[0] = new Pessoa(); pessoas[1] = new Pessoa(); pessoas[2] =
		 * new Pessoa(); pessoas[3] = new Pessoa(); pessoas[4] = new Pessoa();
		 * pessoas[5] = new Pessoa(); pessoas[6] = new Pessoa();
		 */

		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoa();
			System.out.print("Nome pessoa: ");
			pessoas[i].setNome(sc.nextLine());
			System.out.print("Idade: ");
			pessoas[i].setIdade(sc.nextInt());
			sc.nextLine();
		}

		for (int i = 0; i < pessoas.length; i++) {

			//System.out.println("Nome [" + i + "] : " + pessoas[i].getNome());
			//System.out.println("idade [" + i + "] : " + pessoas[i].getIdade());

			System.out.println(pessoas[i]);
		}

	}
}