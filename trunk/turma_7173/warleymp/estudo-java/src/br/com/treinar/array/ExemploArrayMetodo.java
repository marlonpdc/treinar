package br.com.treinar.array;

public class ExemploArrayMetodo {

	public static void main(String[] args) {
		Integer[] numeros = criarArray(5);
		imprimir(numeros);

		String nome1 = "Nome 1";
		String nome2 = "Nome 2";
		String nome3 = "Nome 3";
		String nome4 = "Nome 4";
		String nome5 = "Nome 5";

		imprimir("Gleidson", nome1, nome2);
		imprimir("Warley", nome1, nome2, nome3);
		imprimir("Igor", nome1, nome2, nome3, nome4, nome5);

	}

	private static void imprimir(Integer[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	private static Integer[] criarArray(Integer qtdPosicoes) {
		Integer[] numeros = new Integer[qtdPosicoes];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}
		return numeros;
	}

	private static void imprimir(String nome, String... nomes) {
		System.out.println("Solicitante: " + nome);
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("\t" + nomes[i]);
		}
	}

}
