package br.com.treinar.humberto;

public enum Mes {

	JANEIRO("Janeiro", 31),
	FEVEREIRO("Fevereiro", 28),
	MARCO("Março", 31),
	ABRIL("Abril", 30),
	MAIO("Maio", 31),
	JUNHO("Junho", 30),
	JULHO("Julho", 31),
	AGOSTO("Agosto", 31),
	SETEMBRO("Setembro", 30),
	OUTUBRO("Outubro", 31),
	NOVEMBRO("Novembro", 30),
	DEZEMBRO("Dezembro", 31);
	
	private int qtdDias;
	
	private String descricao;
	
	private Mes(String descricao, int qtdDias) {
		this.descricao = descricao;
		this.qtdDias = qtdDias;
	}
	
	public int getQtdDias() {
		return qtdDias;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
	
	
}
