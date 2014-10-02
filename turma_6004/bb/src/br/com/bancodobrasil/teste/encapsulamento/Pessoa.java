package br.com.bancodobrasil.teste.encapsulamento;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

import br.com.bancodobrasil.teste.excecao.NaoTemPaoException;
import br.com.bancodobrasil.teste.excecao.PerdeuODinheiroException;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Date dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Pao comprarPao() throws NaoTemPaoException, PerdeuODinheiroException {
		Random r = new Random();
		int numero = r.nextInt(3);
		Pao p = null;
		if (numero == 0) {
			Integer a = 0 / 0;
			p = new Pao();
			p.setIngrediente("farinha de trigo");
			p.setValor(.1);
		}
		if (numero == 1) {
			throw new NaoTemPaoException();
		}
		if (numero == 2) {
			throw new PerdeuODinheiroException();
		}
		return p;
	}
	
	public void tomarBanho() {
		Random r = new Random();
		int numero = r.nextInt(2);
		if (numero >= 1) {
			System.out.println("Banho tomado ");
		} else {
			RuntimeException rte = new RuntimeException();
			throw rte;
		}
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento
				+ "]";
	}
	
	
}
