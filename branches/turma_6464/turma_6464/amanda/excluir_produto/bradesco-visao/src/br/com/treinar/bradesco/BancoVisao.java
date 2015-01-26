package br.com.treinar.bradesco;

import javax.swing.JOptionPane;

import br.com.treinar.bradesco.banco.Conta;
import br.com.treinar.bradesco.banco.SaldoInsuficienteException;
import br.com.treinar.bradesco.controle.BradescoControle;
import br.com.treinar.bradesco.controle.CartaoControle;
import br.com.treinar.bradesco.controle.ContaControle;
import br.com.treinar.bradesco.controle.ContaPoupancaControle;
import br.com.treinar.bradesco.controle.PrevidenciaControle;

public class BancoVisao {

	public Conta conta;
	ContaControle contaControle;
	CartaoControle cartaoControle;
	ContaPoupancaControle poupancaControle;
	BradescoControle bradescoControle;
	PrevidenciaControle previdenciaControle;
	
	public BancoVisao() {
		contaControle = new ContaControle();
		poupancaControle = new ContaPoupancaControle();
		cartaoControle = new CartaoControle();
		previdenciaControle = new PrevidenciaControle();
	}
	
	public void iniciar() {
		String opcao = null;
		String numerConta = null;
		do {
			opcao = JOptionPane.showInputDialog("Digite\n"
											  + "1 - Criar Conta\n"
											  + "2 - Deposita\n"
											  + "3 - Sacar\n"
											  + "4 - Exibir Saldo\n"
											  + "5 - Editar taxa de rendimento\n"
											  + "6 - Cadastrar Cartão de Crédito\n"
											  + "7 - Tarifar Produtos\n"
											  + "8 - Cadastrar Previdencia Privada\n"
											  + "9 - Excluir Conta\n"
											  + "10 - Excluir Conta\n"
											  + "11 - Excluir Conta\n"
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
					ContaCorrente contaCorrente = (ContaCorrente)conta;
					contaCorrente.setTarifa(Double.parseDouble(tarifa));

					break;
				case "2":
					conta = new ContaPoupanca();
					criarConta();
					break;

				default:
					break;
				}
				contaControle.cadastrarConta(conta);
				break;
			case "2" :
				numerConta = JOptionPane.showInputDialog("Numero Da Conta");
				String valorDeposito = JOptionPane.showInputDialog("Valor");
				contaControle.depositar(Double.parseDouble(valorDeposito), Long.valueOf(numerConta));
				break;
			case "3" :
				try {
					sacar();
				} catch (SaldoInsuficienteException e) {
					JOptionPane.showMessageDialog(null, e.getCausa());					
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "valor invalido");
				}
				break;
			case "4" :
				numerConta = JOptionPane.showInputDialog("Numero Da Conta");
				JOptionPane.showMessageDialog(null, contaControle.recuperarSaldo(Long.parseLong(numerConta)));
				break;
			case "5" :
				Double taxaAtual = ContaPoupanca.getTaxaRendimento();
				String taxa = JOptionPane.showInputDialog("Taxa de Rendimento atual =" + taxaAtual + " Nova taxa de rendimento");
				poupancaControle.editarTaxaRendimento(Double.valueOf(taxa));
				break;
			case "6" :
				Double limite = Double.parseDouble(JOptionPane.showInputDialog("Taxa do Limite"));
				Integer diaVencimento = Integer.parseInt(JOptionPane.showInputDialog("Dia Vencimento"));
				CartaoCredito cartao = new CartaoCredito();
				cartao.setDiaVencimento(diaVencimento);
				cartao.setLimite(limite);
				cartaoControle.cadastrarCartao(cartao );
				break;
			case "7" :
				try {
					bradescoControle.tarifar();					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro ao tarifar...");
				}
				break;
			case "8" :
				Double premio = Double.parseDouble(JOptionPane.showInputDialog("Valor premio"));
				PrevidenciaPrivada titulo = new PrevidenciaPrivada();;
				titulo.setPremio(premio);
				previdenciaControle.cadastrarPlanoPrevidencia(titulo );
				break;

			default:
				break;
			}
			
			System.out.println("Opção: " + opcao);
		} while (!opcao.equals("0"));
	}

	private void sacar() throws SaldoInsuficienteException {
		String numerConta;
		numerConta = JOptionPane.showInputDialog("Numero Da Conta");
		String valorSaque = JOptionPane.showInputDialog("Valor:");
		contaControle.sacar(Double.parseDouble(valorSaque), Long.parseLong(numerConta));
		JOptionPane.showMessageDialog(null, "saque efetuado com sucesso");
	}

	private void criarConta() {
		Long numero = Long.parseLong(JOptionPane.showInputDialog("Numero da Conta"));
		conta.setNumeroConta(numero);;
		
		String nomeTitular = JOptionPane.showInputDialog("Nome do Titular");
		String enderecoTitular = JOptionPane.showInputDialog("Endereço do Titular");
		Long cpf = Long.parseLong(JOptionPane.showInputDialog("CPF do Titular"));
		Double valor = Double.parseDouble(JOptionPane.showInputDialog("Saldo"));
		conta.setTitular(new Titular());
		conta.getTitular().setNome(nomeTitular);
		conta.getTitular().setEndereco(enderecoTitular);
		conta.getTitular().setCpf(cpf);
		conta.depositar(valor);
	}
	
}
