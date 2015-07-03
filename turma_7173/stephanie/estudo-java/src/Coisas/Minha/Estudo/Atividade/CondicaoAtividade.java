package Coisas.Minha.Estudo.Atividade;

import java.util.Scanner;

public class CondicaoAtividade {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int condicao;
		System.out.print("Opção: ");
		condicao=leitor.nextInt();

		while (condicao !=0){
			while ( condicao > 0) {
				System.out.print(" Opção: ");
				System.out.println(condicao--);
			}
			System.out.print("Opção: ");
			condicao = leitor.nextInt();

		}
		leitor.close();

	}
}