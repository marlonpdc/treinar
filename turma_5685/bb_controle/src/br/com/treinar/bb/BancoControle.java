package br.com.treinar.bb;

import java.util.Date;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;

public class BancoControle {

	protected String teste;
	
	private void cadastrarConta(Conta conta, Long codigo, String nomeCliente, Date dataNascimento) {
		conta.codigo = codigo;
		conta.cliente = new Cliente();
		conta.cliente.nome = nomeCliente;
		conta.cliente.dataNascimento = dataNascimento;
		System.out.println(teste);
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
