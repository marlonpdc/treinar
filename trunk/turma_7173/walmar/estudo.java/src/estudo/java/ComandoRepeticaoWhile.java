package estudo.java;

import java.util.Scanner;

public class ComandoRepeticaoWhile {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int condicao;
		System.out.print("Opção");
		condicao=leitor.nextInt();
		
		while (condicao !=0){
			System.out.println("Gleidson...");
			System.out.print("Opçãao: ");
			condicao = leitor.nextInt();
			}
	
	leitor.close();
	
	}

}
