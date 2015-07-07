public class TesteConstrutor {
	public static void main(String[] args) {

		Pessoa p1, p2, p3, p4;

		p1 = new Pessoa(30, "Edmar");

		System.out.println(p1.nome);
		System.out.println(p1.idade);

		p2 = new Pessoa(6);
		System.out.println(p2.idade);

		p3 = new Pessoa("Clayton");
		System.out.println(p3.nome);

		p4 = new Pessoa();
		p4.nome = "Clodoaldo";
		p4.idade = 8;
		System.out.println(p4.nome);
		System.out.println(p4.idade);
		
	}

}
