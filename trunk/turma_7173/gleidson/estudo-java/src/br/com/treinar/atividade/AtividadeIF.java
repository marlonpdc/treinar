package br.com.treinar.atividade;

public class AtividadeIF {

	public static void main(String[] args) {
		int hora = 2;
		String oi;

		if (hora < 12) {
			oi = "Bom dia...";
		} else {
			if (hora >= 12 && hora > 18) {
				oi = "Boa tarde";
			} else {
				oi = "Boa noite...";
			}
		}

		if (hora < 12) {
			oi = "Bom dia...";
		} else if (hora >= 12 && hora > 18) {
			oi = "Boa tarde";
			System.out.println("");
		} else {
			oi = "Boa noite...";
		}
		
		String ola = hora < 12 ? "Bom dia" : hora >= 12 && hora > 18 ? "Boa tarde" : "Boa noite...";

		System.out.println(oi);
		System.out.println(ola);

		hora = 20;

		oi = hora < 12 ? "Bom dia!" : "Boa Tarde";
		boolean humor = false;

		System.out.println(oi);
		System.out.println(hora < 12 && humor ? "Bom dia!" : "Boa Tarde");

	}

}
