package br.com.treinar.locadora.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.treinar.locadora.controller.BaseDados;
import br.com.treinar.locadora.controller.BaseDadosCliente;
import br.com.treinar.locadora.controller.CadastrarCliente;
import br.com.treinar.locadora.model.Cliente;
import br.com.treinar.locadora.model.Contrato;
import br.com.treinar.locadora.model.Veiculo;

public class ControleDados {

	public void iniciar() {
		Integer opcao = null;
		String opcaoEscolhida = null;

		do {
			opcaoEscolhida = JOptionPane.showInputDialog(" LOCADORA DE VEÍCULOS JAVA \n\n " +
					"O que você deseja alugar? \n Digite:\n"
					+ "1 - Carro\n"
					+ "2 - Micro Onibus\n"
					+ "0 - Sair ");
			opcao = Integer.parseInt(opcaoEscolhida);
			switch (opcao) {
			case 1:
				alugarCarro();
				break;
			case 2:
				alugarOnibus();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, " Até Logo.");
				System.exit(1);
				break;
			default:
				JOptionPane.showMessageDialog(null, "ERRO \n Número digitado inválido.");
				break;
			}
		} while (opcao != 0);
	}

	public void alugarCarro(){
		String modelo =(JOptionPane.showInputDialog(" Digite o Modelo do veículo:\n"));
		double qtd =(Double.parseDouble(JOptionPane.showInputDialog(" Digite a potência desejada:\n")));
		verificarCadastro(modelo, qtd);
	}

	public void alugarOnibus(){
		String modelo =(JOptionPane.showInputDialog(" Digite o Modelo do veículo:\n"));
		double qtd =(Double.parseDouble(JOptionPane.showInputDialog(" Digite a quantidade de lugares:\n")));
		verificarCadastro(modelo, qtd);
	}

	public void verificarCadastro(String m, double q){
		Integer opcao = null;
		String opcaoEscolhida = null;

		do {
			opcaoEscolhida = JOptionPane.showInputDialog(" Cliente possui cadastro:\n"
					+ "1 - Sim\n"
					+ "2 - Não\n"
					+ "3 - Exibir Contratos\n"
					+ "4 - Exibir Lista de Clientes\n"
					+ "0 - Voltar Menu Principal ");
			opcao = Integer.parseInt(opcaoEscolhida);
			switch (opcao) {
			case 1:
				novoContrato(m,q);
				break;
			case 2:
				novoCliente(m, q);
				break;
			case 3:
				exibirContratos();
				break;
			case 4:
				imprimirListaClientes();
				break;
			case 0:
				iniciar();
				break;
			default:
				JOptionPane.showMessageDialog(null, "ERRO \n Número digitado inválido.");
				break;
			}
		} while (opcao != 0);
	}
	
	public void novoCadastroContrato(String m, double q){
		Integer opcao = null;
		String opcaoEscolhida = null;

		do {
			opcaoEscolhida = JOptionPane.showInputDialog(" Digite  a opção desejada:\n"
					+ "1 - Cadastrar Contrato\n"
					+ "2 - Exibir Contratos\n"
					+ "3 - Exibir Lista de Clientes\n"
					+ "0 - Voltar Menu Principal ");
			opcao = Integer.parseInt(opcaoEscolhida);
			switch (opcao) {
			case 1:
				novoContrato(m,q);
				break;
			case 2:
				exibirContratos();
				break;
			case 3:
				imprimirListaClientes();
				break;
			case 0:
				iniciar();
				break;
			default:
				JOptionPane.showMessageDialog(null, "ERRO \n Número digitado inválido.");
				break;
			}
		} while (opcao != 0);
	}
	
	private void novoContrato(String m, double q) {
		List<Contrato> contrato = new ArrayList<Contrato>();
		Contrato c = new Contrato();
		Veiculo v = new Veiculo();
		CadastrarCliente cc = new CadastrarCliente();
		String cpf;
		boolean b;
		long lcpf;
		
		v.setChassi(Long.parseLong(JOptionPane.showInputDialog("Digite o Chassi do veículo:\n")));
		lcpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do Cliente:\n"));
		// verifica se o CPF digitado existe na base de dados
		b = BaseDadosCliente.getInstance().existeCliente(lcpf);
		if(b){
			cc.setCpf(lcpf);
			cpf = BaseDadosCliente.getInstance().recuperarClientePorCpf(lcpf);
			
			v.setModelo(m);
			v.setPotencia(q);
					
			cc.setNome(cpf);
			
			c.setIdContrato(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Contrato:\n")));
			c.setPeriodo(JOptionPane.showInputDialog("Digite o numero de dias de aluguel:\n"));
			c.setValor(calcularValor(c.getPeriodo()));
			
			c.setCliente(cc);
			c.setVeiculo(v);
			
			contrato.add(c);
			contrato = BaseDados.getInstance().adicionarConta(c);
			JOptionPane.showMessageDialog(null, " Contrato cadastrado com Sucesso.");
		}else{
			verificarCadastro(m, q);
		}
	}

	private void novoCliente(String m, double q) {
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		CadastrarCliente cad = new CadastrarCliente();
		Cliente cl = new Cliente();
		String nome;
		String cpf;
		long lcpf;

		nome = JOptionPane.showInputDialog("Digite o nome do Cliente:\n");
		cpf = JOptionPane.showInputDialog("Digite o Cpf do Cliente:\n");
		lcpf = Long.parseLong(cpf);
		// verifica se o CPF digitado já existe na base de dados
		if(!cad.equals(lcpf)){
			cl.setNome(nome);
			cl.setCpf(lcpf);
			cad.novoCliente(nome, lcpf);
			listaCliente.add(cl);
			listaCliente = BaseDadosCliente.getInstance().adicionarConta(cl);
			JOptionPane.showMessageDialog(null, " Cliente cadastrado com Sucesso.");
			novoCadastroContrato(m,q);
		}else{
			novoCliente(nome, q);
		}
	}
	
	private void exibirContratos() {
		List<Contrato> contas = BaseDados.getInstance().recuperarContratos();
		String todasContas = "";
		if(!contas.isEmpty()){
			for (Contrato nome : contas) {
				todasContas += nome.toString();
				todasContas += "\n\n";
			}
			JOptionPane.showMessageDialog(null, todasContas);
		}
		else{
			JOptionPane.showMessageDialog(null, "Não existem Contratos.");
		}
	}
	
	public void imprimirListaClientes() {
		List<Cliente> clientes = BaseDadosCliente.getInstance().recuperarContratos();
		String todosClientes = "";
		if(!clientes.isEmpty()){
			for (Cliente nome : clientes) {
				todosClientes += nome.toString();
				todosClientes += "\n\n";
			}
			JOptionPane.showMessageDialog(null, todosClientes );
		}
		else{
			JOptionPane.showMessageDialog(null, "Não existem Clientes.");
		}
	}

	private double calcularValor(String p) {
		double valor = Double.parseDouble(p) * 150;
		return valor;
	}
}
