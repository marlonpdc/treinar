package estudo.excecao;

public class TesteLeitor {

	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		
		try {
			Integer i = leitor.lerInteiro();			
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("RuntimeException");
		}
		
	}
	
}
