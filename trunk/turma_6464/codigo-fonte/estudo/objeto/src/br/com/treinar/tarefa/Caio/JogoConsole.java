package br.com.treinar.tarefa.Caio;

import javax.swing.JOptionPane;

public class JogoConsole extends Jogo{

	private String nomeSave;
	
	public JogoConsole() {
		
	}
	
	public Boolean Login(){
		Boolean logou = Boolean.FALSE;
		if(nome != ""){
			JOptionPane.showMessageDialog(null, "Iniciando "+nome+"...");
			logou = Boolean.TRUE;
		}
		else{
			JOptionPane.showMessageDialog(null, "Selecione um jogo...");
		}
		return logou;
	}
	
	
	
}
