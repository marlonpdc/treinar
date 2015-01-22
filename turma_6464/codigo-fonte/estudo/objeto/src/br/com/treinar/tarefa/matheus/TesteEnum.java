package br.com.treinar.tarefa.matheus;

import java.util.Scanner;

public class TesteEnum {
	
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de 0 a 6");
		i = sc.nextInt();
		System.out.println(DiaSemana.ordinal(i));
	}

}
