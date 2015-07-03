package br.com.walmar.atividade;

public class AtividadeIf {
	public static void main(String[] args) {

		int hora = 2;
		String oi;

		if (hora <= 12) {
			oi = "Bom dia";
		} else {
			if (hora >= 12 && hora < 18) {
				oi = "Boa tarde";
			} else {
				oi = "Boa noite";
			}
		}
		System.out.println(oi);

		hora = 20;

		oi = hora < 12 ? "Bom dia" : "Boa Tarde";
		boolean humor = true;

		System.out.println(oi);
		System.out.println(hora < 12 && humor ? "Bom dia!" : "Boa tarde");

	}
}
