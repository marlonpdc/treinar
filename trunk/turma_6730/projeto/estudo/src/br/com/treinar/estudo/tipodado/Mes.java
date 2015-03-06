package br.com.treinar.estudo.tipodado;


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
	
	private Mes(String descricao, Integer qtdDias) {
		this.descricao = descricao;
		this.qtdDias = qtdDias;
	}
	
	private String descricao;
	private Integer qtdDias;
	
	public String getDescricao() {
		return descricao;
	}
	
	public static Mes recuperarPorOrdinal(Integer ordinal) {
		return values()[ordinal];
	}
	
	public Integer getQtdDias() {
		return qtdDias;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
}
