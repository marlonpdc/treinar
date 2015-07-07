package br.com.treinar.estudo;

public class TesteConstrutor {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		//p.nome = "Gleidosn";
		System.out.println(p.nome);
		
		Pessoa p2 = new Pessoa("Gleidson", 23);
		System.out.println("Nome: " + p2.nome);
		System.out.println("Idade: " + p2.idade);
	}
	
}
