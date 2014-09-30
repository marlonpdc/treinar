package br.com.bancodobrasil.teste;

import javax.swing.JOptionPane;

import br.com.bancodobrasil.modelo.Cliente;

public class TesteHashCode {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		JOptionPane.showMessageDialog(null, "HashCode c1: " + c1.hashCode() + "\nHashCode c2: " + c2.hashCode());
	}
	
}
