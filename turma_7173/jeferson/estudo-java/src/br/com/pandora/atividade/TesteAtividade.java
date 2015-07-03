package br.com.pandora.atividade;

public class TesteAtividade {
	public static void main(String[] args) {
		Pessoa jef = new Pessoa();
		jef.nome ="Jeferson";
		jef.sobrenome ="Eustaquio";
		jef.idade = 31;
		jef.profissao ="programador";
	
		System.out.println("A pessoa "+jef.nome+" tem "+jef.idade+" anos");
		
		jef.envelhecer();
		System.out.println("A pessoa "+jef.nome+" agora tem "+jef.idade+" anos");
	}

}
