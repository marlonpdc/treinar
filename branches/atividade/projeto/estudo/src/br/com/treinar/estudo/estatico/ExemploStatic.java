package br.com.treinar.estudo.estatico;

public class ExemploStatic {

	public static Integer atributoStatic;
	public Integer atributoDeInstancia;
	
	static {
		System.out.println("executei o inicializador um");
		atributoStatic = 100;
	}
	
	static {
		System.out.println("executei o inicializador dois");
		atributoStatic = 1000;
	}
	
	public ExemploStatic() {
		System.out.println("executou o construtor");
	}
	
	
	{
		System.out.println("teste");
	}
	
	public static Integer somar(Integer a, Integer b) {
		//nao podemos utilizar atributos de instancia em metodos estaticos
		//atributoDeInstancia = 10;
		//nao podemos utilizar metodos de instancia em metodos estaticos
		//subtrair(10, 20);
		return a + b;
	}
	
	public Integer subtrair(Integer a, Integer b) {
		return a - b;
	}
	
	
}
