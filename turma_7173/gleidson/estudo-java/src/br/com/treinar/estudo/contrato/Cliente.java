package br.com.treinar.estudo.contrato;

public class Cliente implements IEmail {

	String nome;
	
	@Override
	public String recuperarTextoEmail() {
		return "<h1>" + nome + "<h1>";
	}

}
