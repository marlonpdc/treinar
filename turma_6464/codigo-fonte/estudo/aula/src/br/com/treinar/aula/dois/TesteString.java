package br.com.treinar.aula.dois;

public class TesteString {

	public static void main(String[] args) {
		String nome = "GLEIDSON";
		String nome1 = new String("GLEIDSON GUIMARÃES MOURA");
		
		StringBuilder sb = new StringBuilder();
		StringBuffer sf = new StringBuffer();
		
		for (int i = 0; i < 1000; i++) {
			//nome += nome + (i + 1) + " ";
			sb.append(nome);
			sb.append(nome).append(" ");
			sb.append(i + 1);
			sb.append("\n");
		}
		
		System.out.println(nome1.length());
		System.out.println(nome1.indexOf('G'));
		
		System.out.println("até o primeiro espaço");
		for (int i = 0; i < nome1.indexOf(" "); i++) {
			System.out.print(nome1.charAt(i));
		}
		System.out.println("\nend");
		
		System.out.println(nome1.lastIndexOf("MO"));
		System.out.println(nome1.isEmpty());
		Boolean nomesIguais = nome1.equals("GLEIDSON GUIMARÃES MOURA");
		System.out.println(nome1.replace(" ", ""));
		System.out.println(nomesIguais);
		System.out.println(nome1.replace("G", "C"));
		System.out.println(nome1 = nome1.trim());
		System.out.println(nome1);
		char[] caracteres = nome1.toCharArray();
		System.out.println(caracteres);
		System.out.println(nome1.toLowerCase());
		
		String[] split = nome1.split(" ");
		System.out.println("Split");
		for (String string : split) {
			System.out.println(string);
		}
		System.out.println("end Split");
		
		System.out.println(split);
		
	}
	
}
