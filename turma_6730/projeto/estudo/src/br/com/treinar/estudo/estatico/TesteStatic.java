package br.com.treinar.estudo.estatico;

public class TesteStatic {

	
	public static void main(String[] args) {
		System.out.println("teste antes de conhecer a classe com atributo ou metodo static");
		System.out.println(ExemploStatic.atributoStatic);
		ExemploStatic exs = new ExemploStatic();
		System.out.println(exs.atributoDeInstancia);
		System.out.println("teste antes de conhecer a classe com atributo ou metodo static");
		ExemploStatic exs2 = new ExemploStatic();
		System.out.println(exs2.atributoDeInstancia);
		
	}
	
	
}
