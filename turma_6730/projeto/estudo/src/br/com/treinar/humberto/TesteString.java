package br.com.treinar.humberto;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Humberto";
//		
//		for (int i = 0; i < 1000; i++) {
//			System.out.println(i);
//			nome += nome;
//		}
//		
//		System.out.println(nome);
//		
		StringBuilder sb = new StringBuilder();
		sb.append("Humberto").append(" ").append("Monteiro");
		System.out.println(sb);
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			sb.append(sb);
		}
		
		System.out.println(sb);
		
		
	}

}
