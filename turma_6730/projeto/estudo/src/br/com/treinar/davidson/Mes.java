package br.com.treinar.davidson;


public enum Mes {

	JANEIRO("Janeiro", 31 ),
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
	
	private Mes(String descricao, Integer dias) {
		this.descricao = descricao;
		this.dias = dias;
	}
	
	private String descricao;
	private Integer dias;
	
	public String getDescricao() {
		return descricao;
	}
	
	public Integer getDias() {
		return dias;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
}
