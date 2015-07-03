package br.com.meneguite.atividade;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int repeticao;
		String nome;
		System.out.println("Informe seu nome:");
		nome = leitor.nextLine();

		System.out.println("Quantas vezes deseja imprimir seu nome?");
		repeticao = leitor.nextInt();
		while (repeticao != 0) {

			while (repeticao > 0) {

				System.out.println(nome);
				repeticao--;
			}

			System.out.println("===================");

			System.out.println("Quantas vezes deseja imprimir seu nome?");
			repeticao = leitor.nextInt();
			
			}
		
		leitor.close();
		}
		
	}

