package br.com.treinar.itau;

import javax.swing.JOptionPane;

import br.com.treinar.itau.modelo.ContaCorrente;
import br.com.treinar.itau.modelo.ContaPoupanca;
import br.com.treinar.itau.modelo.banco.Conta;

public class Itau {

	public Conta conta;
	
	public void iniciar() {
		Integer opcao = 0;
		String opcaoStr = null;
		do {
			opcaoStr = menu();
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 0:
				JOptionPane.showMessageDialog(null, "Fim do programa");
				break;
			case 1:
				criarConta();
				break;
				
			case 2:
				depositar();					
				
				break;
			case 3:
				sacar();					
				
				break;
				
			case 4:
				exibirSaldo();					
				
				break;
				
			default:
				break;
			}
			
		} while (opcao != 0);
	}

	private void exibirSaldo() {
		JOptionPane.showMessageDialog(null, "Saldo: " + String.valueOf(conta.recuperarSaldo()));
	}

	private String menu() {
		String opcaoStr = JOptionPane.showInputDialog("Informe uma opção:\n"
				+ "1 - Cadastrar Conta\n"
				+ "2 - Depositar\n"
				+ "3 - Sacar\n"
				+ "4 - Exibir Saldo\n"
				+ "0 - Sair\n");
		return opcaoStr;
	}

	private void sacar() {
		Double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));			
		Boolean saqueEfetuado = conta.sacar(valorSaque);
		JOptionPane.showMessageDialog(null, saqueEfetuado ? "Saque efetuado!" : "Saque nao efetuado");		
	}

	private void depositar() {
		Double depositoN = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));			
		Boolean depositoEfetuado = conta.depositar(depositoN);
		JOptionPane.showMessageDialog(null, depositoEfetuado ? "Deposito efetuado!" : "Deposito nao efetuado");
	}

	private void criarConta() {
		String menu = "1 - Corrente\n2 - Poupança";
		String opcao = JOptionPane.showInputDialog(menu);
		switch (opcao) {
		case "1":
			conta = new ContaCorrente();
			ContaCorrente contaCorrente = (ContaCorrente) conta;
			criarConta(contaCorrente);			
			break;
		case "2":
			conta = new ContaPoupanca();
			criarConta((ContaPoupanca) conta);
			break;

		default:
			break;
		}
		JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
	}

	private void cadastrar() {
		String numeroContaStr;
		numeroContaStr = JOptionPane.showInputDialog("Digite o numero da conta");
		conta.numeroConta = Integer.parseInt(numeroContaStr);
		//jah acontece no construtor de conta
		//conta.pessoa = new Pessoa();
		conta.pessoa.nome = JOptionPane.showInputDialog("Digite o nome do proprietario");
		conta.pessoa.cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do proprietario"));
	}
	
	private void criarConta(ContaCorrente cc) {
		cadastrar();
		Double tarifa = Double.parseDouble(JOptionPane.showInputDialog("Valor da Tarifa"));
		cc.tarifa = tarifa;
		Double limiteCredito = Double.parseDouble(JOptionPane.showInputDialog("Valor limite credito"));
		cc.limiteCredito = limiteCredito;
	}
	
	private void criarConta(ContaPoupanca cp) {
		cadastrar();
		Double taxaRendimento = Double.parseDouble(JOptionPane.showInputDialog("Valor da Taxa de Rendimento"));
		cp.taxaRendimento = taxaRendimento;
	}
	
	
	
}
