package br.com.treinar.aula.dois;

public class ComandoCond {

	public static void main(String[] args) {

		Integer nota = 5;
		int i;

		if (nota >= 0 && nota < 40) {
			System.out.println("reprovado!");
			i = 1;
		} else if (nota >= 40 && nota < 60) {
			System.out.println("Recuperação");
			i = 2;
		} else if (nota >= 60) {
			System.out.println("Aprovado");
			i = 3;
		} else {
			System.out.println("Nota Inválida");
			i = 4;
		}
		
		System.out.println("-----------------switch--------------");
		
		switch (i) {
		case 1:
			System.out.println("Reprovado");
			break;
		case 2:
			System.out.println("Recuperação");
			break;
		case 3:
			System.out.println("Aprovado");
			
			break;

		default:
			
			System.out.println("Nota inválida");
			break;
		}
		
	}
}
