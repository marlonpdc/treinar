package br.com.bancodobrasil.modelo;

import java.util.Date;

public class Cliente {

	public Date dataNascimento;
	public String nome;
	public Long cpf;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public boolean comparaClasse(Object outro) {
		Cliente c = (Cliente) outro;
		return this.cpf.equals(c.cpf);
	}

	@Override
	public String toString() {
		return "Cliente [dataNascimento=" + dataNascimento + ", nome=" + nome
				+ ", cpf=" + cpf + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
