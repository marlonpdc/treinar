package br.com.bancodobrasil.visao;

import javax.swing.JOptionPane;

import br.com.bancodobrasil.modelo.Cliente;
import br.com.bancodobrasil.modelo.ContaCorrente;
import br.com.bancodobrasil.modelo.ContaPoupanca;
import br.com.bancodobrasil.modelo.Pacote;
import br.com.bancodobrasil.modelo.banco.Conta;
import br.com.bancodobrasil.util.BBUtil;

public class TelaPrincipal {
	
	public void init() {
		Conta c = null;
		Integer opcao = -1;
		
		do {
			String msg = "Bem vindos ao " + BBUtil.nomeBanco + "\n"
					+ "Digite:\n"
					+ "1 - Conta Corrente\n"
					+ "2 - Conta Poupança\n"
					+ "3 - Depositar\n"
					+ "4 - Exibir Saldo\n"
					+ "5 - Sacar\n"
					+ "6 - Exibir Dados\n"
					+ "7 - Cadastrar Taxa Rendimento\n"
					+ "8 - Exibir Taxa Rendimento\n"
					+ "9 - Sacar"
					+ "0 - Sair";
			String opcaoStr = JOptionPane.showInputDialog(msg);
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 1:
				c = new ContaCorrente();
				String numeroContaStr = JOptionPane.showInputDialog("Informe o número da conta"); 
				c.numeroConta = Long.parseLong(numeroContaStr);
				c.proprietario = new Cliente();
				c.proprietario.nome = JOptionPane.showInputDialog("Informe o nome do proprietario da conta");
				String cpfStr = JOptionPane.showInputDialog("Informe o cpf do proprietario da conta");
				c.proprietario.cpf = Long.parseLong(cpfStr);
				((ContaCorrente)c).pacote = new Pacote();
				String tarifaStr = JOptionPane.showInputDialog(" Informe o valor da tarifa");
				((ContaCorrente)c).pacote.tarifa = Double.parseDouble(tarifaStr);
					break;
			case 2:
				c = new ContaPoupanca();
				numeroContaStr = JOptionPane.showInputDialog("Informe o número da conta"); 
				c.numeroConta = Long.parseLong(numeroContaStr);
				c.proprietario = new Cliente();
				c.proprietario.nome = JOptionPane.showInputDialog("Informe o nome do proprietario da conta");
				cpfStr = JOptionPane.showInputDialog("Informe o cpf do proprietario da conta");
				c.proprietario.cpf = Long.parseLong(cpfStr);
				break;
			case 3:
				String valorDepositadoStr = JOptionPane.showInputDialog("Valor a ser depositado");
				Double valorDepositado = Double.parseDouble(valorDepositadoStr);
				c.depositar(valorDepositado);
				break;
			case 4:
				Double saldo = c.recuperarSaldo();
				JOptionPane.showMessageDialog(null,"Saldo: " + saldo);
				break;
			case 5:
				String valorSacadoStr = JOptionPane.showInputDialog("Valor a ser sacado");
				Double valorSacado = Double.parseDouble(valorSacadoStr);
				Boolean sacou = c.sacar(valorSacado);
				if (sacou) {
					JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Saque não efetuado");
				}
				break;
			case 6:
				String dados = "Numero: " + c.numeroConta + "\ncpf: " + c.proprietario.cpf + "\nnome:" + c.proprietario.nome + "\nsaldo" + c.recuperarSaldo();
				if (c instanceof ContaCorrente) {
					dados += "\nTarifa: " + ((ContaCorrente)c).pacote.tarifa + "\nConta Corrente";
				}else if (c instanceof ContaPoupanca) {
					dados += "\nTaxa de Rendimento: " + ContaPoupanca.taxaRendimento + "\nConta Poupança";
				}
				JOptionPane.showMessageDialog(null, dados);
				break;
			case 7:
				String taxaRendimentoStr = JOptionPane.showInputDialog("Informe a taxa de Rendimento: ");
				Double taxaRendimento = Double.parseDouble(taxaRendimentoStr);
				ContaPoupanca.taxaRendimento = taxaRendimento;
				break;
			case 8:
				//TODO adriana	
				taxaRendimento = ContaPoupanca.taxaRendimento;
				JOptionPane.showMessageDialog(null,"Taxa de Rendimento: " + taxaRendimento);
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
