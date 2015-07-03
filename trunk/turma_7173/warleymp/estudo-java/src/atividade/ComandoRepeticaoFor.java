package atividade;

import java.util.Scanner;

public class ComandoRepeticaoFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0 ; i < 10 ; i++ ) {
			System.out.println("repetindo :" + i);
		}
		
	
		leitor.close();
	}
}
