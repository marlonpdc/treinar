package br.com.treinar.tarefa.Caio;

import javax.swing.JOptionPane;

public abstract class Jogo {
	
	private Integer id;
	protected String nome;
	protected String desenvolvedora;
	protected Double preco;
	
	public void setNome(String vnome){
		nome = vnome;
	}
	public void setDesenvolvedora(String vdesenvolvedora){
		desenvolvedora = vdesenvolvedora;
	}
	public void setPreco(Double vpreco){
		preco = vpreco;
	}
	public String getNome(){
		return nome;
	}
	public String getDesenvolvedora(){
		return desenvolvedora;
	}
	public Double getPreco(){
		return preco;
	}
	
	public abstract Boolean Login();
	
	public void Encerrar(){
		JOptionPane.showMessageDialog(null, "Encerrando...");
	}
}
