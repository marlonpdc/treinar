package br.com.reclama.visao;

import javax.swing.JOptionPane;

import br.com.reclama.modelo.Cliente;
import br.com.reclama.modelo.Funcionario;
import br.com.reclama.modelo.Reclamacao;


public class TelaReclama {

	public Reclamacao reclamacao;
	
	
	public void iniciaReclamacao(){
		
		String menu = "Digite:\n"
				+ "1 - Registrar Reclamação\n"
				+ "2 - Imprimir Reclamação\n"
				+ "0 - Sair";
	String opcaoStr = null;
	
	do {
		
		opcaoStr = JOptionPane.showInputDialog(menu);
		
		switch (opcaoStr) {
		case "1":
			reclamacao = new Reclamacao();
			cadastrarReclamacao();
			break;
		case "2":
			
			break;
			
		default:
			break;
		}
		
		
	} while (!opcaoStr.equals("0"));
		
	}


	private void cadastrarReclamacao() {
		cadastrarCliente();
		
		cadastrarFuncionario();
		
		reclamacao.data = JOptionPane.showInputDialog("Data da reclamacao");
		reclamacao.descricao = JOptionPane.showInputDialog("Descricao");
				
	}


	private void cadastrarFuncionario() {
	
		reclamacao.funcionario = new Funcionario();
				
		reclamacao.funcionario.cpfcnpj = Long.parseLong(JOptionPane.showInputDialog("CPF do Fucionario"));
		reclamacao.funcionario.matricula = Long.parseLong(JOptionPane.showInputDialog("Número da matricula"));
		
	}


	private void cadastrarCliente() {
	
		reclamacao.cliente = new Cliente();	
						
		reclamacao.cliente.cpfcnpj = Long.parseLong(JOptionPane.showInputDialog("CNPJ do Cliente"));
		reclamacao.cliente.nome = JOptionPane.showInputDialog("Nome do Cliente");
		reclamacao.cliente.responsavel = JOptionPane.showInputDialog("Nome do responsável");
		reclamacao.cliente.telefone = Long.parseLong(JOptionPane.showInputDialog("Telefone para contato"));
				
	}
	
}
