package br.com.treinar.string;

public class TesteString {

	public static void main(String[] args) {
		String nomes = "gleidson;raquel;gabriel;gilberto";
		int i = 0;
		for (i = 0; i < nomes.length(); i++) {
			System.out.print(nomes.charAt(i));
			System.out.print("-");
		}
		String[] nomeSplit = nomes.split("a"); 
		for (i = 0; i < nomeSplit.length; i++) {
			System.out.println(nomeSplit[i]);
		}
		System.out.println(nomes.substring(24, 27));
		System.out.println(nomes.indexOf("a"));
		System.out.println(nomes.lastIndexOf("a"));
		
		System.out.println(nomes.contains("raq"));
		System.out.println(nomes.isEmpty());
		nomes = nomes.replace(";", "|");
		System.out.println(nomes);
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < 100000; j++) {
			sb.append(nomes);
		}
		System.out.println(sb);
		sb.append("gleidson").append(";").append("fim");
	}
	
}
