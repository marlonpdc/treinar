package br.com.treinar.priscila;

public class Exercício1 {
	public static void main(String[] args) {
		Nome obt1 = new Nome();
		Nome obt2 = new Nome();

		obt1.nome = "Priscila";
		obt2.nome="Ana";
		System.out.println("Nome 1: " + obt1.nome);
		System.out.println("Nome 2:" + obt2.nome);
		obt1 = obt2;
		System.out.println(obt1.nome == obt2.nome);

	}
}
