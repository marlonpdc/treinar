package br.com.treinar.modelo;

public enum TipoTelefone {

	COMERCIAL("Comercial"),
	PESSOAL("Pessoal"),
	RESIDENCIAL("Residencial");
	
	private String descricao;
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public static TipoTelefone getByOrdinal(Integer ordinal) {
		try {
			return values()[ordinal];	
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException(ordinal.toString());
		}
	}
}
