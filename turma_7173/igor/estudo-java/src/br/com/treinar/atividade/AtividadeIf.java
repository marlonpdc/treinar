package br.com.treinar.atividade;

public class AtividadeIf {
	public static void main(String[] args) {

		String cumprimento;
		int h = 2;

		if (h < 12) {
			cumprimento = "Bom dia!";
			System.out.println(cumprimento);

		} else {
			cumprimento = "Boa Tarde!";
			System.out.println(cumprimento);
		}

		h = 20;

		cumprimento = h < 12 ? "Bom dia" : "Boa tarde";

		boolean humor = false;

		System.out.println(cumprimento);

		System.out.println(h < 12 && humor ? "Bom dia" : "Boa tarde");
	}
}
