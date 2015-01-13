package br.com.treinar.tarefa.Caio;

import javax.swing.JOptionPane;

public class JogoOnline extends Jogo {
	String login;
	String senha;
	Boolean logado;
	
	public JogoOnline() {
		logado = Boolean.FALSE;
	}	
	
	public Boolean Login(){
		Boolean logou = Boolean.FALSE;
		if(login == "Buda" && senha == "Buda"){
			JOptionPane.showMessageDialog(null, "Bem vindo...");
			logou = Boolean.TRUE;
			logado = Boolean.TRUE;
		}
		else{
			JOptionPane.showMessageDialog(null, "Login ou senha incorretos...");
		}
		return logou;
	}
	
	
	
	
}
