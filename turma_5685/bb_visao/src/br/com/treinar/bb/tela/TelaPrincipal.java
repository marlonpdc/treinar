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
				break;
			}
		} while (opcao != 0);
	}

	private void cadastrarConta() {

		Long codigo = Long.valueOf(JOptionPane.showInputDialog("Codigo"));
		String nomeCliente = JOptionPane.showInputDialog("Nome do Cliente");
		Date dataNascimento = util.criarData(JOptionPane.showInputDialog("Data nascimento"));
		
		controle.cadastrarConta(codigo, nomeCliente, dataNascimento);
		
	}
}
