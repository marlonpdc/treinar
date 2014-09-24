package br.com.bancodobrasil.visao;

import javax.swing.JOptionPane;

import br.com.bancodobrasil.modelo.Cliente;
import br.com.bancodobrasil.modelo.banco.Conta;

public class TelaPrincipal {
	
	public void init() {
		Conta c = null;
		Integer opcao = -1;
		
		do {
			
			String msg = "Digite:\n1-Criar Conta\n"
					+ "2-Depositar\n"
					+ "3-Exibir Saldo\n"
					+ "4-Sacar\n"
					+ "5-Exibir Dados\n"
					+ "0-Sair";
			String opcaoStr = JOptionPane.showInputDialog(msg);
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 1:
				c = new Conta();
				String numeroContaStr = JOptionPane.showInputDialog("Informe o número da conta"); 
				c.numeroConta = Long.parseLong(numeroContaStr);
				c.proprietario = new Cliente();
				c.proprietario.nome = JOptionPane.showInputDialog("Informe o nome do proprietario da conta");
				String cpfStr = JOptionPane.showInputDialog("Informe o cpf do proprietario da conta");
				c.proprietario.cpf = Long.parseLong(cpfStr);
				break;
			case 2:
				String valorDepositadoStr = JOptionPane.showInputDialog("Valor a ser depositado");
				Double valorDepositado = Double.parseDouble(valorDepositadoStr);
				c.depositar(valorDepositado);
				break;
			case 3:
				Double saldo = c.recuperarSaldo();
				JOptionPane.showMessageDialog(null,"Saldo: " + saldo);
				break;
			case 4:
				String valorSacadoStr = JOptionPane.showInputDialog("Valor a ser sacado");
				Double valorSacado = Double.parseDouble(valorSacadoStr);
				Boolean sacou = c.sacar(valorSacado);
				if (sacou) {
					JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Saque não efetuado");
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Numero: " + c.numeroConta + "\ncpf: " + c.proprietario.cpf + "\nnome:" + c.proprietario.nome + "\nsaldo" + c.saldo );
				break;
			case 0:
				System.out.println("opcao sair 0");
				//Erica
				break;

			default:
				System.out.println("opcao errada");
				break;
			}
			
			
		} while (opcao != 0);
		
	}
	
}
