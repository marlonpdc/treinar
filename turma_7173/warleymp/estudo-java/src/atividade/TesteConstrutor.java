package atividade;

class TesteConstrutor {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("warley",35);
		
		Pessoa w = new Pessoa("warley", 18);
		pessoa.bairro = "centro";
		System.out.println(w.nome);
		System.out.println(w.idade);
	}

}
