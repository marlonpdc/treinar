package br.com.pandora.atividade;

public class ExemploNota {

	public static void main(String[] args) {
		String resultado;
		int nota = 80;

		if (nota < 40) {
			resultado = "Reprovado";

		} else if (nota >= 40 && nota < 60) {
			resultado = "Recuperação";

		} else {
			resultado = "Aprovado";
		}

		System.out.println(resultado);
	}
}
