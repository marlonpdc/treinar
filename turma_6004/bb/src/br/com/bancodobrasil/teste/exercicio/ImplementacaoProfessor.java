package br.com.bancodobrasil.teste.exercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class ImplementacaoProfessor {

	public static void main(String[] args) {
		String opcaoStr = null;
		Integer opcao = null;
		String nome = null;
		String chave = null;
		Set<String> chaves = null;
		List<String> nomesList = null;
		Map<String, List<String>> nomes = new HashMap<>();
		do {
			opcaoStr = JOptionPane.showInputDialog("Digite:\n1-Informar Nome\n0 - Finalizar");
			opcao = Integer.parseInt(opcaoStr);
			
			switch (opcao) {
			case 1:
				nome = JOptionPane.showInputDialog("Informe o nome:");
				chave = nome.substring(0, 1);
				if (!nomes.containsKey(chave)) {
					nomes.put(chave, new ArrayList<String>());
				}
				nomes.get(chave).add(nome);
				break;
			case 0:
				chaves = nomes.keySet();
				for (String key : chaves) {
					nomesList = nomes.get(key);
					for (String nomeTemp : nomesList) {
						System.out.println(nomeTemp);
					}
					System.out.println("----------");
				}
				JOptionPane.showMessageDialog(null, nomes);
				break;

			default:
				break;
			}

		} while (!opcao.equals(0));
		
	}
	
}
