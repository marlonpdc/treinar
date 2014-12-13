package br.com.treinar.agenda.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public enum TipoTelefone {

	CELULAR("Celular"),
	COMERCIAL("Comercial"),
	RESIDENCIAL("Residencial");
	
	
	private String descricao;
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public TipoTelefone getByOrdinal(Integer ordinal) {
		try {
			return values()[ordinal];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	public TipoTelefone getByDescription(String description) {
		for (TipoTelefone conta : values()) {
			if (conta.descricao.equals(description)) {
				return conta;
			}
		}
		throw new IllegalArgumentException(description);
	}
	
	public static List<TipoTelefone> valuesOrderByDescription() {
		List<TipoTelefone> tipos = Arrays.asList(values());
		Collections.sort(tipos, new Comparator<TipoTelefone>() {
			@Override
			public int compare(TipoTelefone o1, TipoTelefone o2) {
				return o1.descricao.compareTo(o2.descricao);
			}
		});
		return tipos;
	}

}
