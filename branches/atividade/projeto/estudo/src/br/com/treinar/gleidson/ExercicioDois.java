package br.com.treinar.gleidson;

public class ExercicioDois {

	public static void main(String[] args) {
		Pessoa pUm = new Pessoa();
		pUm.nome = "Sophia";
		System.out.println(pUm.nome);
		Pessoa pDois = pUm;
		
		System.out.println(pUm == pDois);
		
		System.out.println(pDois.nome);
		
		pDois = new Pessoa();
		pDois.nome = "Sophia";
		
		System.out.println(pUm.nome == pDois.nome);
		
		pDois = null;
		pUm = null;
	
	}
	
}
