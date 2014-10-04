package br.com.treinar.bb;

import java.util.Date;

import br.com.treinar.bb.dado.BaseDados;

public class BancoControle {

	public void cadastrarConta(Long codigo, String nomeCliente, Date dataNascimento) {
		BaseDados.getInstance().conta = new ContaCorrente();
		BaseDados.getInstance().conta.codigo = codigo;
		BaseDados.getInstance().conta.cliente = new Cliente();
		BaseDados.getInstance().conta.cliente.nome = nomeCliente;
		BaseDados.getInstance().conta.cliente.dataNascimento = dataNascimento;
	}

}
