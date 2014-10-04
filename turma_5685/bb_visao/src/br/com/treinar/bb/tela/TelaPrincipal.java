package br.com.treinar.bb.tela;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.treinar.bb.BancoControle;
import br.com.treinar.bb.DadosContaControle;
import br.com.treinar.bb.DepositoControle;
import br.com.treinar.bb.SaldoControle;
import br.com.treinar.bb.SaqueControle;
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
		//System.out.println(controle.teste);
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
				exibirDadosConta();
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

	private void exibirSaldo() {
		JOptionPane.showMessageDialog(null, "Saldo: "+ saldoControle.recuperarSaldo());		
	}

	private void exibirDadosConta() {
		JOptionPane.showConfirmDialog(null, contaControle.recuperarDados());
	}

	private void cadastrarConta() {
		String opcaoStr = null;
		Integer opcao = null;
		Double valorTarifa = null;
		Double taxaRendimento = null;
		Long codigo = Long.valueOf(JOptionPane.showInputDialog("Codigo"));
		String nomeCliente = JOptionPane.showInputDialog("Nome do Cliente");
		Date dataNascimento = util.criarData(JOptionPane.showInputDialog("Data nascimento"));
		
		opcaoStr = JOptionPane.showInputDialog("Digite\n\n"
				+ "1 - Corrente\n"
				+ "2 - Poupança\n");
		opcao = Integer.parseInt(opcaoStr);
		switch (opcao) {
			case 1:
				valorTarifa = Double.valueOf(JOptionPane.showInputDialog("Valor da Tarifa"));
				controle.cadastrarContaCorrente(codigo, nomeCliente, dataNascimento, valorTarifa);				
				break;
			case 2:
				taxaRendimento = Double.valueOf(JOptionPane.showInputDialog("Valor da Taxa de Rendimento"));
				controle.cadastrarContaPoupanca(codigo, nomeCliente, dataNascimento, taxaRendimento);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Tipo de conta inválido, ação cancelada!");
				break;
			default:
				break;
		}
	}
	
	private void sacarConta() {
		Double valorSaque = Double.valueOf(JOptionPane.showInputDialog("Digite o valor a ser sacado"));
		saqueControle.sacarConta(valorSaque);
		JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!"); 
		
	}
	
	private void depositar() {
		Double valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor do deposito"));
		depositoControle.depositar(valor);
	}
}
