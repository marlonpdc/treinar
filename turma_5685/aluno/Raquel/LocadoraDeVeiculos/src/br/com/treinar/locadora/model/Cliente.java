package br.com.treinar.locadora.model;

import javax.swing.JOptionPane;

public class Cliente {
	
	private String nome;
	private long cpf;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getCpf() {
		return cpf;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cpf ^ (cpf >>> 32));
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf != other.cpf)
			return false;
		return true;
	}
	
	public String toString() {
		return "Cliente: \n [nome=" + nome + ", \n cpf=" + cpf + "]";
	}
		
	public boolean isCliente(long cpf){
		if (equals(cpf)){
			JOptionPane.showMessageDialog(null,"Cliente já possui cadastro! \n");
			return true;
		}
		return false;
	}	
}
