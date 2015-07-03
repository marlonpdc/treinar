package br.com.treinar.atividade;

import javax.swing.JOptionPane;

public class AtividadeNota {

	public static void main(String[] args) {

		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
		
		String estadoAluno;

		if (nota < 40) {
			estadoAluno = "Reprovado!";
		} else if (nota >= 40 && nota < 60) {
			estadoAluno = "Recuperacao!";
		} else {
			estadoAluno = "Aprovado!";
		}

		JOptionPane.showMessageDialog(null, estadoAluno);

	}

}
