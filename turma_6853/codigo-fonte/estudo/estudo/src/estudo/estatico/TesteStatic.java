package estudo.estatico;

@SuppressWarnings("static-access")
public class TesteStatic {

	public static void main(String[] args) {
		ExemploStatic.variavelClasse = 30;
		ExemploStatic exs1 = new ExemploStatic();
		ExemploStatic exs2 = new ExemploStatic();
		
		
		
		exs1.variavelInstancia = 10;
		exs2.variavelInstancia = 20;
		
		System.out.println(exs1.variavelClasse);
		System.out.println(exs2.variavelClasse);
		System.out.println(ExemploStatic.variavelClasse);
		exs2.variavelClasse = 48;
		System.out.println(exs1.variavelClasse);
		
	}
	
}
