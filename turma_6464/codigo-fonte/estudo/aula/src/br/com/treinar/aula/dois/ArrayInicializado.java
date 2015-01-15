package br.com.treinar.aula.dois;

import javax.swing.JOptionPane;

public class ArrayInicializado {

	public static void main(String[] args) {
		String[] nomes = {"Gleidson", "Nathalia", "Amanda"};

		String nomesView = "";
		for (int i = 0; i < nomes.length; i++) {
			nomesView  += nomes[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, nomesView);
 	}
	
}
