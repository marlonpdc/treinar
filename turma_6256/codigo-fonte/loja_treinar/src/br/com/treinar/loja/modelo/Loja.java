package br.com.treinar.loja.modelo;

public class Loja {
	
	public String nome;
	public Funcionario vendedor;
	public Cliente cliente;
	public Produto produto;
	
	public Venda vender() {
		Venda venda = new Venda();
		//verificar disponibilidade produto
		//verificar situacao do cliente
		venda.cliente = cliente;
		venda.produto = produto;
		venda.vendedor = vendedor;
		vendedor.comissionar(produto);
		return venda;
	}
	
	
}
