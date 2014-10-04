package br.com.treinar.bb;

import java.util.Date;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;

public class BancoControle {

	private void cadastrarConta(Conta conta, Long codigo, String nomeCliente, Date dataNascimento) {
		BaseDados.getInstance().conta.codigo = codigo;
		BaseDados.getInstance().conta.cliente = new Cliente();
		BaseDados.getInstance().conta.cliente.nome = nomeCliente;
		BaseDados.getInstance().conta.cliente.dataNascimento = dataNascimento;
	}

	public void cadastrarContaCorrente(Long codigo, String nomeCliente,
			Date dataNascimento, Double valorTarifa) {
		BaseDados.getInstance().conta = new ContaCorrente();
		Conta conta = BaseDados.getInstance().conta;
		cadastrarConta(conta, codigo, nomeCliente, dataNascimento);
		((ContaCorrente)conta).tarifa = valorTarifa;
		
	}

	public void cadastrarContaPoupanca(Long codigo, String nomeCliente,
			Date dataNascimento, Double taxaRendimento) {
		BaseDados.getInstance().conta = new ContaPoupanca();
		Conta conta = BaseDados.getInstance().conta;
		cadastrarConta(conta, codigo, nomeCliente, dataNascimento);
		((ContaPoupanca)conta).taxaRendimento = taxaRendimento;
	}

}
