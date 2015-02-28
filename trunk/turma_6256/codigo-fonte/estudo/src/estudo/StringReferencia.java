package estudo;

public class StringReferencia {

	public static void main(String[] args) {
		String nome = "Gleidson";
		String nome2 = "Gleidson";
		
		Pessoa p = new Pessoa();
		p.nome = nome;
		Pessoa p2 = new Pessoa();
		p2.nome = nome2;
		
		System.out.println(nome == nome2);
		System.out.println(p == p2);
		System.out.println(p.nome == p2.nome);
		
		p.nome = new String("Gleidson");
		System.out.println(p.nome == p2.nome);
		
		nome += " 1";
		nome += " 2";
		nome += " 3";
		nome += " 4";
		nome += " 5";
		nome += " 6";
		
		
		
		
	}
	
}
