package atividade;

import javax.swing.JOptionPane;

public class ExemploNota {

	public static void main(String[] args) {
		//		int nota = 61;
		String avaliacao;

		String notaComoString = JOptionPane.showInputDialog("Digite a nota");
		int nota = Integer.parseInt(notaComoString);

		if (nota < 40) {
			avaliacao = "Reprovado";
		} else if (nota >= 40 && nota < 60) {
			avaliacao = "Recuperação";
		} else {
			avaliacao = "Aprovado";
		}

		//		String nome = JOptionPane.showInputDialog("Digite seu nome");

		JOptionPane.showMessageDialog(null, "voce foi " + avaliacao);
		System.out.println("Avaliação do aluno :" + avaliacao);

	}


}

