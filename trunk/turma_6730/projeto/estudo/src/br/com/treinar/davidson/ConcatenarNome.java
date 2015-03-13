package br.com.treinar.davidson;

public class ConcatenarNome {
	public static void main(String[] args) {

		String a = "Davidson";
		String b = "Marcos";
		String c = "Batista";
		
		StringBuilder sbnomecompleto = new StringBuilder();
		sbnomecompleto.append(a).append(" ").append(b).append(" ").append(c);
		System.out.println(sbnomecompleto);
	}
}
