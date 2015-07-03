package atividade;

import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int numeroRepeticao;
		System.out.print("Numero de Repetição: ");
		numeroRepeticao = leitor.nextInt();

		while (numeroRepeticao != 0){
			while (numeroRepeticao > 0){
				System.out.println("Repetindo  " + numeroRepeticao);
				numeroRepeticao--;
			}
			System.out.print("Numero de Repetição: ");
			numeroRepeticao = leitor.nextInt();			
		}
        leitor.close();
		System.out.println("Teclou 0 [finalizou...]  ");

	}
}
