package br.com.treinar.aula.excecao;

public class IndiceInvalido {

	public static void main(String[] args)  {
		try {
			metodoUm();			
		} catch (NumberFormatException e) {
			System.out.println("Erro de parser int");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("erro de indice de array");
		} catch (Exception e) {
			System.out.println("erro fatal");
		}
		
		System.out.println("Fim do programa");
	}

	private static void metodoUm() {
		Integer[] numeros = new Integer[2];
		Long.parseLong("a");
		gravar();
		//Integer.parseInt("A");

		System.out.println(numeros[2]);			
		
	}
	
	
	
	public static void gravar()  {
		try {
			
			System.out.println("tenta Gravar");
		} catch (Exception e) {
			
		}
	}
	
	
	
}
