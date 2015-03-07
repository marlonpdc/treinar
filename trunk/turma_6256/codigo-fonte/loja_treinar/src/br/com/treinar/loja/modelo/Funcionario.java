package br.com.treinar.loja.modelo;

public class Funcionario {

	public String nome;
	public Integer idade;
	public Double salario;
	public Double comissao;
	
	public Funcionario() {
		comissao = 0d;
	}
	
	public void comissionar(Produto produto) {
		comissao += produto.preco * (produto.pegarPorcentagemComissao()  / Double.valueOf(100));
	}
	
}
