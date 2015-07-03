package br.com.meneguite.atividade;

public class AtividadeIf {
	public static void main(String[] args) {

		String fala;
		int hora = 12;

		if (hora >= 12 & hora <= 18) {
			fala = "Boa Tarde!";
			System.out.println(fala);
		} else if (hora < 12 & hora > 0) {
			fala = "Bom dia.";
			System.out.println(fala);
		} else {
			fala = "Boa noite";
			System.out.println(fala);
		}

	}

}
