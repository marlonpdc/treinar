package br.com.reclama.modelo;

import br.com.reclama.modelo.principal.Pessoa;

public class Funcionario extends Pessoa {

	public Long matricula;
	public String setor;
	
	
	public void sac() {
		this.setor = "SAC";		
	}
		
}
