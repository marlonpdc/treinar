package estudo.string;

public class Teste {

	public static void main(String[] args) {
		String nome = "Gleidson";

		String primeiraLetra = nome.substring(0, 1);
		Character c = nome.charAt(0);
		
		System.out.println(primeiraLetra);
		System.out.println(c);
		System.out.println(nome.toUpperCase());
		System.out.println(nome);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 10; i++) {
			if (i % 100 == 0) {
				sb.append("\n");
			}
			sb.append(nome).append(nome);
		}
		System.out.println(sb);
		
		String x = new String("Gleidson");

		
		String y = "Gilberto";
		String z = "Gilberto";
			
		System.out.println(x == y);
		System.out.println(y == z);
		
		
	}
	
}
