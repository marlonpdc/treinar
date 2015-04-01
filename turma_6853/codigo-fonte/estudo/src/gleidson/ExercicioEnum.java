package gleidson;

import java.util.Scanner;

import estudo.dominiodiscreto.DiaSemana;

public class ExercicioEnum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a posição do dia da semana: ");
		
		Integer posicao = sc.nextInt();
		
		DiaSemana[] dias = DiaSemana.values();
		
		System.out.println(dias[posicao]);
		
		sc.close();
		
	}
	
}
