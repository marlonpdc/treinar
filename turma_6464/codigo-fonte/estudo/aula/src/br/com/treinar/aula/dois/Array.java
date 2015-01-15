package br.com.treinar.aula.dois;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		String[] nomes;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de nomes: ");
		Integer qtd = sc.nextInt();
		sc.nextLine();
		nomes = new String[qtd];
		String nomesView = "";
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o nome " + (i + 1) + ": ");
			nomes[i] = sc.nextLine();
		}
		
		for (int i = 0; i < nomes.length; i++) {
			nomesView += nomes[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, nomesView);
		sc.close();
 	}
	
}
