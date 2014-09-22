//Deitel, Java: Como Programar, Exercício 2.6, Cap.2, pág. 50

package br.com.bancodobrasil.teste;

import java.util.Scanner;

public class ExercicioDeitel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int soma;
		int mult;
		int sub;
		int div;
		
		System.out.println("Informe o primeiro inteiro: ");
		num1 = input.nextInt();
		
		System.out.println("Informe o segundo inteiro: ");
		num2 = input.nextInt();
		
		soma = num1 + num2;
		System.out.println("A SOMA é: " + soma);
		
		mult = num1 * num2;
		System.out.println("O PRODUTO é: " + mult);
		
		sub = num1 - num2;
		System.out.println("A DIFERENÇA é: " + sub);
		
		div = num1 / num2;
		System.out.println("A DIVISÃO é: " + div);
		
	}

}
