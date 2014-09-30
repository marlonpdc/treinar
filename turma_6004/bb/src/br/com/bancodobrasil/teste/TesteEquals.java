package br.com.bancodobrasil.teste;

import javax.swing.JOptionPane;

import br.com.bancodobrasil.modelo.Cliente;

public class TesteEquals {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.cpf = 55546265302l;
		c2.cpf = 55546265302l;
		
		boolean comparacao = c1 == c2;
		
		JOptionPane.showMessageDialog(null, c1.equals("gleidosn"));
		
	}
	
}
