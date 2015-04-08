package br.com.treinar.bb.modelo.exception;

import javax.swing.JOptionPane;


public class ValorInvalidoException  extends Exception {


	private static final long serialVersionUID = 3635244654433763054L;

	public String message = "Você digitou um valor inválido!";
	
	public void message() {
		
		JOptionPane.showMessageDialog(null, message);
	}
	
	
	
}
