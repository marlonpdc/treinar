package br.com.treinar.aula.dois;

public class Pessoa {

	private String nome;
	private Long cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	public Boolean ehIgual(Pessoa outro) {
		/*
		Boolean ehIgual = Boolean.FALSE;
		if (cpf.equals(outro.getCpf())) {
			ehIgual = Boolean.TRUE;
		}
		return ehIgual;*/
		return cpf.equals(outro.getCpf());
	}
	
  	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	public String apresentarComoTexto() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}

	
}
