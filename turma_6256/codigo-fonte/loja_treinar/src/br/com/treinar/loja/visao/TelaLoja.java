package br.com.treinar.loja.visao;

import br.com.treinar.loja.modelo.Cliente;
import br.com.treinar.loja.modelo.Funcionario;
import br.com.treinar.loja.modelo.Loja;
import br.com.treinar.loja.modelo.Produto;
import br.com.treinar.loja.modelo.Venda;


public class TelaLoja {

	public void abrirLoja() {
		Funcionario f = new Funcionario();
		f.nome = "Daniel";
		f.idade = 19;
		f.salario = 5900.05;
		
		Cliente c = new Cliente();
		c.nome = "Sophia";
		c.idade = 2;
		
		Produto p = new Produto();
		p.descricao = "Mamadeira";
		p.preco = 18.59;
		p.atribuirValorPorcentagemComissao(5);
		
		Loja l = new Loja();
		l.cliente = c;
		l.vendedor = f;
		l.nome = "Americanas";
		l.produto = p;

		
		Venda vendaUm = l.vender();
		Venda vendaDois = l.vender();
		Venda vendaTres = l.vender();
		
		System.out.println(vendaUm.produto.preco);
		System.out.println(vendaDois.produto.preco);
		System.out.println(vendaTres.produto.preco);
		
		System.out.println(p.pegarPorcentagemComissao());
		System.out.println(f.comissao);
		
	}
	
}
