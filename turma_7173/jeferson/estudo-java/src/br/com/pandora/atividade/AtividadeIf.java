package br.com.pandora.atividade;

public class AtividadeIf {
	public static void main(String [] args) {
		String cumprimento = " ";
		int hora = 12;
		
		if (hora < 12) {
			cumprimento = "Bom dia";
			System.out.println(cumprimento);

		} else {
			cumprimento = "Boa tarde";
			System.out.println(cumprimento);
		}
	}
}
