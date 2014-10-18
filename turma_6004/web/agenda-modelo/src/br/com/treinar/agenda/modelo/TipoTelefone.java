package br.com.treinar.agenda.modelo;

import com.sun.xml.internal.txw2.IllegalAnnotationException;

public enum TipoTelefone {

	CELULAR("Celular"),
	COMERCIAL("Comercial"),
	RESIDENCIAL("Residencial");
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	public TipoTelefone getByDescription(String descricao) {
		for (TipoTelefone tipoTelefone : TipoTelefone.values()) {
			if (tipoTelefone.getDescricao().equals(descricao)) {
				return tipoTelefone;
			}
		}
		throw new IllegalArgumentException(descricao);
	}
	
	public TipoTelefone getByOrdinal(Integer ordinal) {
		try {
			return TipoTelefone.values()[ordinal];			
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalAnnotationException(e);
		}
	}
	@Override
	public String toString() {
		return getDescricao();
	}
}
