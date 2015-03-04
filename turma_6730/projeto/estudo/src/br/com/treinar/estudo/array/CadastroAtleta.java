package br.com.treinar.estudo.array;

import java.util.Scanner;

import br.com.treinar.estudo.modelo.Atleta;

public class CadastroAtleta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade de Atletas: ");
		Integer quantidade = sc.nextInt();
		sc.nextLine();
		Atleta[] atletas = new Atleta[quantidade];
		Atleta atleta = null;
		for (int i = 0; i < atletas.length; i++) {
			atleta = new Atleta();
			System.out.print("Informe o nome do Atleta: ");
			atleta.nome = sc.nextLine();
			System.out.print("Informe a idade do Atleta: ");
			atleta.idade = sc.nextInt();
			sc.nextLine();
			atletas[i] = atleta;
		}
		
		for (Atleta atletaTemp : atletas) {
			System.out.println("Nome: " + atletaTemp.nome + " Idade:" + atletaTemp.idade);
		}
		sc.close();
		
	}
	
}
