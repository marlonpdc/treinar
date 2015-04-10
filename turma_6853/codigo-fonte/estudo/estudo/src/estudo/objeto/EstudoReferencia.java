package estudo.objeto;

public class EstudoReferencia {

	public static void main(String[] args) {
		Pessoa p1 = null;
		Pessoa p2 = null;
		p1 = new Pessoa();
		p1.setNome("Gleidson");
		p1.setAltura(10);
		p2 = new Pessoa();
		p2.setNome("Gleidson");
		p2.setAltura(10);
		Pessoa p3 = p1;
		
		System.out.println("p1 == p2: " + (p1 == p2));
		System.out.println("p1.equals(p2): " + (p1.equals(p2)));
		
		System.out.println(p1 == p3);
		
		p3.setNome("Maria Sophia");
		
		System.out.println(p1.getNome());
		
		try {
			Pessoa p = (Pessoa) Class.forName("estudo.objeto.Pessoa").newInstance();
			System.out.println(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
}
