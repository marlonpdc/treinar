package br.com.treinar.aula.excecao;

import java.util.Scanner;

import br.com.treinar.aula.dois.Pessoa;

public class NullPointerExample {

	
	public static void main(String[] args) {
		Pessoa pessoa = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		Integer num = sc.nextInt();
		if (num < 10) {
			pessoa = new Pessoa();
		}
		try {			
			System.out.println(pessoa.getNome());
		} catch (Exception e) {
			System.out.println("Você tentou acessar um recurso nulo!");
		}
		sc.close();
	}
	
}
