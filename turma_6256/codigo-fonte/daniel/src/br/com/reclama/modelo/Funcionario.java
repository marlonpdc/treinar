package br.com.reclama.modelo;

import br.com.reclama.modelo.principal.Pessoa;

public class Funcionario extends Pessoa {

	private Long matricula;
	private String setor;
	
	
	public void sac() {
		this.setor = "SAC";		
	}


	public Long getMatricula() {
		return matricula;
	}


	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}
		
}
