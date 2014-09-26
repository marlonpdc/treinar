package br.com.bancodobrasil.teste;

public class TesteArrayAlanderson {
	public static void main(String[] args) {

		int pessoas = 10;
		int soma = 0;
		int media = 0;
		System.out.println("Informe a quantidade de Pessoas que irão responder ao questionário: ");

		Integer[] money = new Integer[pessoas];
		money[0] = 20; 
		money[1] = 10; 
		money[2] = 2; 
		money[3] = 1; 
		money[4] = 4; 
		money[5] = 0; 
		money[6] = 5; 
		money[7] = 40; 
		money[8] = 180; 
		money[9] = 16; 

		for (int i = 0; i < money.length; i++) {
			System.out.println("Quanto cada pessoa tem de dinheiro na carteira?" + i);

			soma = money.length;
			media = money.length / 10;

			System.out.println("A soma é: " + soma);
			System.out.println("A média é: " + media);
		}
	}


}
