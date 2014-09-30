package br.com.bancodobrasil.teste;

import javax.swing.JOptionPane;

import br.com.bancodobrasil.modelo.Cliente;

public class TesteToString {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.nome = "Gleidson";
		c.cpf = 55546265302l;
		JOptionPane.showMessageDialog(null, c);
	}
	
}
