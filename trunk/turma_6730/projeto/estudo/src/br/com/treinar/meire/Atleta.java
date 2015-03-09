package br.com.treinar.meire;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Atleta {
	public static void main(String[] args) {
		List<String> colecao = new ArrayList<String>();

		String quantidade;
		quantidade = JOptionPane.showInputDialog("Quantos atletas deseja cadastrar:");
		Integer quantidade1 = Integer.parseInt(quantidade);

		for (int i = 0; i < quantidade1; i++) {

			colecao.add(JOptionPane.showInputDialog("Digite o nome do atleta:"));

                                                                   

		}
		String msg = "";
		for (String nomeAtleta : colecao) {
			msg += nomeAtleta + "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
		

	}
}
