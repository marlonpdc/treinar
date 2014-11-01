package br.com.treinar.locadora.controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.treinar.locadora.model.Cliente;

public class CadastrarCliente extends Cliente {
	
	List<Cliente> listaCliente = new ArrayList<Cliente>();
	
	public Cliente novoCliente(String nome, long cpf) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		if(!isCliente(cpf)){
			listaCliente.add(cliente);
		}
		return cliente;
	}
	
	public void imprimirListaClientes() {
		for (Cliente nome : listaCliente) {
			JOptionPane.showMessageDialog(null, nome.getNome() + "\n " + nome.getCpf() );
		}
	}
	
	public String recuperarClientePorCpf(Long cpf) {
		String dados = "";
		for (Cliente c : listaCliente) {
			if (c.getCpf() == cpf) {
				dados += c.getNome();
			}
		}
		return dados;
	}
}
