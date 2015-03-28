package br.com.bruno.banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TelaConta {

	private List<Conta> arrayConta;
	private Scanner sc;
	
	public TelaConta() {
		sc = new Scanner(System.in);
		arrayConta = new ArrayList<>();
	}

	private void CadastroContas(){

		Conta conta = null;
		System.out.print(" Informe quantas contas deseja criar: ");
		Integer qtd = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < qtd; i++) {
			conta = new Conta();
			System.out.print("Informe o numero da Conta: ");
			conta.setNumeroConta(sc.nextInt());
			sc.nextLine();
			System.out.print("Informe o nome do titular da Conta: ");
			conta.getCliente().setNomeTitular(sc.next());
			System.out.print("Informe o cpf do titular da Conta: ");
			conta.getCliente().setCpf(sc.nextInt());
			sc.nextLine();
			arrayConta.add(conta);
			System.out.println("Conta cadastrada com sucesso.\n");

		}
	}
	private void ListarContas(){

		for (Conta conta : arrayConta) {
			System.out.print("Numero da Conta:" + conta.getNumeroConta() + "\n");
			System.out.print("Nome do Titular:" + conta.getCliente().getNomeTitular(conta) + "\n");
			System.out.print("Saldo da Conta:" + conta.getSaldoConta()+ "\n");
			System.out.print("Limite da Conta:" + conta.getLimiteConta()+ "\n");
		}
	}
	private void LocMostrarContas(){

		System.out.println("Informe o numero da conta:");
		Integer numContaPesq = sc.nextInt();

		for (Conta conta : arrayConta) {
			if (conta.getNumeroConta().equals(numContaPesq)) {
				System.out.println("Dados da conta:");
				System.out.print("Numero da Conta:" + conta.getNumeroConta() + "\n");
				System.out.print("Nome do Titular:" + conta.getCliente().getNomeTitular(conta) + "\n");
				System.out.print("Saldo da Conta:" + conta.getSaldoConta()+ "\n");
				System.out.print("Limite da Conta:" + conta.getLimiteConta()+ "\n");
			}else {
				System.out.println("Não existe conta cadastrada com esse número.");
			}
		}

	}

	private void RemoverConta(Conta removida){
		Boolean removeu = Boolean.FALSE;
		Iterator<Conta> iterator = arrayConta.iterator();
		while (iterator.hasNext()) {
			Conta conta = iterator.next();
			if(conta.equals(removida)){
				iterator.remove();
				removeu = Boolean.TRUE;
				break;
			}
		}
		System.out.println(removeu ? "Conta removida" : "Conta não cadastrada!");

	}

	public void iniciar() {
		Scanner dadoEntrada = new Scanner(System.in);
		Integer opcao;
		do{
			System.out.println("--------------------");
			System.out.println("Cadastro de Cliente");
			System.out.println("--------------------");
			System.out.println("[1] - Inserir");
			System.out.println("[2] - Listar");
			System.out.println("[3] - Localizar conta através do número da Conta");
			System.out.println("[4] - Remover conta");
			System.out.println("[5] - Sair");
			System.out.println("--------------------");
			System.out.print("Informe Opcao: ");
			opcao = dadoEntrada.nextInt();
			System.out.println("--------------------");

			switch(opcao){
			case 1: {   
				CadastroContas();    
				break;
			}
			case 2: {   
				ListarContas();;
				break;
			}
			case 3: {   
				LocMostrarContas();
				break;
			}
			case 4: {
				System.out.print("Informe o numero da conta: ");
				Integer numContaPesq = sc.nextInt();
				Conta contaRemovida = new Conta();
				contaRemovida.setNumeroConta(numContaPesq);
				RemoverConta(contaRemovida);
				break;
			}
			default:
				break;
			}            
		} while(opcao != 5);
		dadoEntrada.close();
	}

}
