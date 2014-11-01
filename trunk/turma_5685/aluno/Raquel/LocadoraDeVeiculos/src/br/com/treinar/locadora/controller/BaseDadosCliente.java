package br.com.treinar.locadora.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import br.com.treinar.locadora.model.Cliente;

public class BaseDadosCliente {

	private static BaseDadosCliente instance;
	private List<Cliente> clientes;

	private BaseDadosCliente() {
		super();
		clientes = new ArrayList<Cliente>();
	}

	static {
		instance = new BaseDadosCliente();
	}

	public static BaseDadosCliente getInstance() {
		return instance;
	}

	public List<Cliente> adicionarConta(Cliente cli) {
		if (cli != null) {
			clientes.add(cli);
		}
		return (List<Cliente>) clientes;
	}

	public List<Cliente> recuperarContratos() {
		return this.clientes;
	}

	public Cliente recuperarContratoPorCodigo(long codigo) {
		Cliente novocontrato = new Cliente();
		novocontrato.setCpf(codigo);
		Integer index = (clientes.indexOf(novocontrato));
		return index != null ? clientes.get(index) : null;
	}

	public String recuperarClientePorCpf(Long cpf) {
		String dados = "";

		for (Cliente c : clientes) {
			if (c.getCpf() == cpf) {
				dados += c.getNome();
			}
		}
		return dados;

	}
	public boolean existeCliente(Long cpf){
		for (Cliente c : clientes) {
			if (c.getCpf() == cpf){
				return true;
			}
		}
		JOptionPane.showMessageDialog(null, "CPF " + cpf + " não cadastrado");
		return false;
	}
	
	public boolean existeContratos(List<Cliente> cli) {
		if (cli == null) {
			return false;
		}
		return true;
	}
}
