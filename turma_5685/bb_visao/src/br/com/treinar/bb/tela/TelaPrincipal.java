package br.com.treinar.bb.tela;

import javax.swing.JOptionPane;

import br.com.treinar.bb.Cliente;
import br.com.treinar.bb.Conta;
import br.com.treinar.bb.util.BBUtil;

public class TelaPrincipal {

	private BBUtil util;
	
	public TelaPrincipal() {
		util = BBUtil.getInstance();
	}
	
	public void iniciar() {
		Integer opcao = null;
		String opcaoStr = null;
		Conta c = null;
		do {
			opcaoStr = JOptionPane.showInputDialog("Digite\n\n"
					+ "1 - Criar Conta\n"
					+ "2 - Depositar\n"
					+ "3 - Sacar\n"
					+ "0 - Sair\n");
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 1:
				c = new Conta();
				c.codigo = Long.valueOf(JOptionPane.showInputDialog("Codigo"));
				c.cliente = new Cliente();
				c.cliente.nome = JOptionPane.showInputDialog("Nome do Cliente");
				c.cliente.dataNascimento = util.criarData(9,11,1980);
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
}
