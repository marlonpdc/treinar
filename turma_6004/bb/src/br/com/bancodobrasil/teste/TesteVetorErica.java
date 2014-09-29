package br.com.bancodobrasil.teste;

import javax.swing.JOptionPane;

public class TesteVetorErica {

	public static void main(String[] args) {
			Integer qtdPessoas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pessoas a serem entrevistadas"));
			Integer salarios[] = new Integer[qtdPessoas];
			Integer salario = null;
			Integer somaSalario = 0;
			for (int i = 0; i < salarios.length; i++) {
				salario = Integer.parseInt(JOptionPane.showInputDialog(" Valor disponivel na carteira " + (i + 1)));
				salarios[i] = salario;
				somaSalario += salario;
			}
			System.out.println("O total do valor é: " + somaSalario);
			System.out.println("A média salarial é: " + somaSalario / qtdPessoas);
		}
		
	}

