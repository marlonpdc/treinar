package br.com.treinar.bradesco;

import javax.swing.JOptionPane;

public class Banco {

	public Conta conta;
	
	public void iniciar() {
		String opcao = null;
		do {
			opcao = JOptionPane.showInputDialog("Digite\n"
											  + "1 - Criar Conta\n"
											  + "2 - Deposita\n"
											  + "3 - Sacar\n"
											  + "4 - Exibir Saldo\n"
											  + "0 - Sair\n");

			switch (opcao) {
			case "1":
				String tipoConta = JOptionPane.showInputDialog("Tipo de conta\n"
											  + "1 - Corrente\n"
											  + "2 - Poupança");
				switch (tipoConta) {
				case "1":
					conta = new ContaCorrente();
					criarConta();
					String tarifa = JOptionPane.showInputDialog("Valor da tarifa");
					((ContaCorrente)conta).setTarifa(Double.parseDouble(tarifa));
	
					break;
				case "2":
					conta = new ContaPoupanca();
					criarConta();
					
					break;

				default:
					break;
				}
				break;
			case "2" :
				String valorDeposito = JOptionPane.showInputDialog("Valor:");
				conta.depositar(Double.parseDouble(valorDeposito));
				break;
			case "3" :
				String valorSaque = JOptionPane.showInputDialog("Valor:");
				Boolean sacou = conta.sacar(Double.parseDouble(valorSaque));
				if (sacou) {
					JOptionPane.showMessageDialog(null, "saque efetuado com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "saldo insuficiente");					
				}
				break;
			case "4" :
				JOptionPane.showMessageDialog(null, conta.saldo);
				break;

			default:
				break;
			}
			
			System.out.println("Opção: " + opcao);
		} while (!opcao.equals("0"));
	}

	private void criarConta() {
		Long numero = Long.parseLong(JOptionPane.showInputDialog("Numero da Conta"));
		conta.setNumeroConta(numero);;
		
		String nomeTitular = JOptionPane.showInputDialog("Nome do Titular");
		String enderecoTitular = JOptionPane.showInputDialog("Endereço do Titular");
		Long cpf = Long.parseLong(JOptionPane.showInputDialog("CPF do Titular"));
		Double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta"));
		conta.titular = new Titular();
		conta.titular.nome = nomeTitular;
		conta.titular.endereco = enderecoTitular;
		conta.titular.cpf = cpf;
		conta.saldo = saldo;
	}
	
	public void teste() {
		
	}
	
}
