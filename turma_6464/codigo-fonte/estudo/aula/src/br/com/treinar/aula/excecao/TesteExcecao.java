package br.com.treinar.aula.excecao;

public class TesteExcecao {

	public static void main(String[] args) {
		Filho f = new Filho();
		
		try {
			System.out.println("antes de tomar banho");
			f.tomarBanho();
			System.out.println("depois de tomar banho");
		} catch (Exception e) {
			System.out.println("Nao tomou banho!");
		}
		System.out.println("fim do programa!");
	}
	
}
