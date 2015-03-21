package estudo.construtor;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 2637290119272572497L;

	public String nome;
	public Integer peso;
	public Integer velocidadeAtual;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	public Pessoa() {
		super();
	}

	public void correr() {
		velocidadeAtual = 2;
	}
	
	public void correr(Integer distancia, Integer velocidade) {
		velocidadeAtual = 2;
	}
	
	public void correr(Integer distancia) {
		velocidadeAtual = 2;
	}
	/*
	 * Não é possível dois metodos com as 
	 * mesmas sequencias de parametro
	 * 
	public void correr(Integer distancia) {
		velocidadeAtual = 2;
	}*/
	
	public void andar() {
		velocidadeAtual = 1;
	}
	
	public void parar() {
		velocidadeAtual = 0;
	}
	
	@Deprecated
	public boolean definirIgual(Pessoa pessoa) {
		boolean igual = false;
		if (this.nome == pessoa.nome) {
			igual = true;
		}
		return igual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", peso=" + peso + ", velocidadeAtual="
				+ velocidadeAtual + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Finalizando objeto");
	}
	
}
