package br.com.treinar.bb.tela;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.treinar.bb.BancoControle;
import br.com.treinar.bb.util.BBUtil;

public class TelaPrincipal {

	private BBUtil util;
	private BancoControle controle;
	
	public TelaPrincipal() {
		util = BBUtil.getInstance();
		controle = new BancoControle();
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
				
				break;
			case 3:
				
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
				
				break;
	
			default:
				break;
		}
			
		
	}
}
