package br.com.treinar.bb.tela;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.treinar.bb.Cliente;
import br.com.treinar.bb.ContaCorrente;
import br.com.treinar.bb.ContaPoupanca;
import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.controle.BancoControle;
import br.com.treinar.bb.controle.DadosContaControle;
import br.com.treinar.bb.controle.DepositoControle;
import br.com.treinar.bb.controle.SaldoControle;
import br.com.treinar.bb.controle.SaqueControle;
import br.com.treinar.bb.dado.BaseDados;
import br.com.treinar.bb.util.BBUtil;

public class TelaPrincipal {

	private BBUtil util;
	private BancoControle controle;
	private DadosContaControle contaControle;
	private SaqueControle saqueControle;
	private SaldoControle saldoControle;
	private DepositoControle depositoControle;
	
	public TelaPrincipal() {
		util = BBUtil.getInstance();
		controle = new BancoControle();
		contaControle = new DadosContaControle();
		depositoControle = new DepositoControle();
		saqueControle = new SaqueControle();
		saldoControle = new SaldoControle();
	}
	
	public void iniciar() {
		Integer opcao = null;
		String opcaoStr = null;

		do {
			opcaoStr = JOptionPane.showInputDialog("Digite\n\n"
					+ "1 - Criar Conta\n"
					+ "2 - Depositar\n"
					+ "3 - Sacar\n"
					+ "4 - Exibir Saldo\n"
					+ "5 - Exibir Dados da Conta\n"
					+ "6 - Cadastrar Taxa Rendimento\n"
					+ "7 - Exibir Taxa Rendimento\n"
					+ "0 - Sair\n");
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 1:
				cadastrarConta();
				break;
			case 2:
				depositar();
				break;
			case 3:
				sacarConta();				
				break;
			case 4:
				exibirSaldo();
				break;
			case 5:
				exibirDadosConta(BaseDados.getInstance().conta);
			case 6:
				cadastrarTaxaRendimento();
				break;
			case 7:
				exibirTaxaRendimento();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado volte sempre!");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}

	private void exibirTaxaRendimento() {
		JOptionPane.showMessageDialog(null, ContaPoupanca.getTaxaRendimento());
	}

	private void cadastrarTaxaRendimento() {
		Double taxaRendimento = Double.valueOf(JOptionPane.showInputDialog("Valor da Taxa de Rendimento"));
		ContaPoupanca.setTaxaRendimento(taxaRendimento);
	}

	private void exibirSaldo() {
		JOptionPane.showMessageDialog(null, "Saldo: "+ saldoControle.recuperarSaldo());		
	}

	private void exibirDadosConta(final Conta conta) {
		//TODO - melhorar o codigo
		
		
		conta.depositar(1000d);
		
		JOptionPane.showMessageDialog(null, conta.codigo);
	}

	private void cadastrarConta() {
		Conta conta = null;
		String opcaoStr = null;
		Integer opcao = null;
		Long codigo = Long.valueOf(JOptionPane.showInputDialog("Codigo"));
		String nomeCliente = JOptionPane.showInputDialog("Nome do Cliente");
		Date dataNascimento = util.criarData(JOptionPane.showInputDialog("Data nascimento"));
		
		opcaoStr = JOptionPane.showInputDialog("Digite\n\n"
				+ "1 - Corrente\n"
				+ "2 - Poupança\n");
		opcao = Integer.parseInt(opcaoStr);
		switch (opcao) {
			case 1:
				conta = new ContaCorrente();
				popularConta(conta, codigo, nomeCliente, dataNascimento);
				cadastrarContaCorrente((ContaCorrente)conta);
				controle.cadastrarContaCorrente(conta);
				break;
			case 2:
				conta = new ContaPoupanca();
				popularConta(conta, codigo, nomeCliente, dataNascimento);
				cadastrarContaPoupanca((ContaPoupanca) conta);
				controle.cadastrarContaPoupanca(conta);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Tipo de conta inválido, ação cancelada!");
				break;
			default:
				break;
		}
	}

	private void popularConta(Conta conta, Long codigo, String nomeCliente, Date dataNascimento) {
		conta.codigo = codigo;
		conta.cliente = new Cliente();
		conta.cliente.nome = nomeCliente;
		conta.cliente.dataNascimento = dataNascimento;
	}
	
	private void cadastrarContaPoupanca(ContaPoupanca c) {
		//faz alguma atualizacao exclusiva de conta poupanca
	}

	private void cadastrarContaCorrente(ContaCorrente c) {
		Double valorTarifa = Double.valueOf(JOptionPane.showInputDialog("Valor da Tarifa"));
		Double limiteCredito = Double.valueOf(JOptionPane.showInputDialog("Limite de crédito"));		
		c.setTarifa(valorTarifa);
		c.setLimiteCredito(limiteCredito);
	}

	private void sacarConta() {
		Double valorSaque = Double.valueOf(JOptionPane.showInputDialog("Digite o valor a ser sacado"));
		saqueControle.sacarConta(valorSaque);
		JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!"); 
		
	}
	
	private void depositar() {
		Double valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor do deposito"));
		Long codigo = Long.valueOf(JOptionPane.showInputDialog("Digite o código da conta"));
		depositoControle.depositar(codigo, valor);
	}
}
