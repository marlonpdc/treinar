package br.com.treinar.aula.excecao;

public class ExemploNullPointerException {

	public static void main(String[] args) {
		String nome = "Gleidson";
		if ("a".equals("a")) {
			nome = null;
		}
		System.out.println(nome.length());
		
	}
	
}
