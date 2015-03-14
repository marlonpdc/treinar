package br.com.reclama.modelo;

import br.com.reclama.modelo.principal.Pessoa;

public class Cliente extends Pessoa {

	private Long cnpj;
	private String responsavel;
	
	public Long getCnpj() {
		return cnpj;
	}
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
		
	
}
