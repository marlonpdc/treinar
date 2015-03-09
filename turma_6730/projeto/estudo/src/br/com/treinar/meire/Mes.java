package br.com.treinar.meire;

public enum Mes {

	JANEIRO("Janeiro", 31),
	FEVEREIRO("Fevereiro", 28),
	MARCO("Março", 31),
	ABRIL("Abril",30),
	MAIO("Maio",31),
	JUNHO("Junho", 30),
	JULHO("Julho", 31),
	AGOSTO("Agosto", 31),
	SETEMBRO("Setembro", 30),
	OUTUBRO("Outubro", 31),
	NOVEMBRO("Novembro", 30),
	DEZEMBRO("Dezembro", 31);
	
	private Mes(String descricao, int numeroDias) {
		this.descricao = descricao;
		this.numeroDias = numeroDias;
	}
	
	private String descricao;
	private int numeroDias;
	
	public String getDescricao() {
		return descricao;
	}
	
	public static Mes recuperarPorOrdinal(Integer ordinal) {
		return values()[ordinal];
	}
	
	public int getQtdDias() {
		return numeroDias;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
}
