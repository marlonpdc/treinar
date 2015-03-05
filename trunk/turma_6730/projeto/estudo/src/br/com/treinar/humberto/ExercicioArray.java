package br.com.treinar.humberto;

import java.util.Scanner;

public class ExercicioArray {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);   // objeto do tipo Scanner para receber informações do teclado
		
		System.out.print("Informe a quantidade de atletas: ");
		
		int qtdAtletas = input.nextInt();   // busca um numero inteiro inserido no obj scanner
		
		Atleta atleta = null;  // obj atleta de apoio
		
		Atleta[] atletas = new Atleta[qtdAtletas]; // array de objetos da classe Atleta
		
		input.nextLine(); // sempre que for usar um nextLine após nextInt é legal que faça um nextLine 
		                  // pular o retorno de linha armazenado no objeto input
                          // após o consumo da quant. de atletas digitada.		  
		
		for (int i = 0; i < atletas.length; i++) {
			
			atleta = new Atleta();  // instancia Atleta
			
			System.out.print("Nome atleta " + (i + 1) + " : ");
			atleta.nome = input.nextLine(); // atributo nome do obj atleta recebe o que foi inserido 
											// no obj input do tipo scanner
			
			System.out.print("Idade atleta " + (i + 1) + " : "); 
			atleta.idade = input.nextInt(); // idem acima
			
			input.nextLine(); // idem anterior
			
			atletas[i] = atleta; // popula o array atletas com os obj atletas instanciados	
		}
		
		System.out.println(); // linha em branco
		
		for (int i = 0; i < atletas.length; i++) {
			
			//printa os atributos dos obj atleta (nome e idade) que estao na linha i do array atletas
			System.out.println(atletas[i].nome + " " + atletas[i].idade); 
			
		}
		
		input.close();  // interrompe o obj do tipo Scanner
		
	}

}
