package estudo.estatico;

public class ExemploStatic {

	public ExemploStatic() {
		System.out.println("fiz antes do static! really?");
	}
	
	public Integer variavelInstancia;
	
	public static Integer variavelClasse;
	
	static {
		variavelClasse = 5;
	}
	
}
