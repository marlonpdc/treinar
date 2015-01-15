package br.com.treinar.aula.dois;

public class ParametroVetor {

	public static void main(String[] args) {
		String[] nomes = {"Gleidson","Amanda","Nathalia"};
		metodoParametroVetor(nomes);
		
		String var1 ="Variavel 1";
		String var2 ="Variavel 2";
		String var3 ="Variavel 3";
		String var4 ="Variavel 4";
		
		metodoParametroVetorIndefinido(1, var1, var2, var3, var4);
		metodoParametroVetorIndefinido(1, var1, var2, var3);
		metodoParametroVetorIndefinido(1, var1, var2);
		metodoParametroVetorIndefinido(1, var1);
		metodoParametroVetorIndefinido(1, nomes);
		
	}
	
	private static void metodoParametroVetor(String[] nomes) {
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
	
	private static void metodoParametroVetorIndefinido(Integer num, String... nomes) {
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
	
}
