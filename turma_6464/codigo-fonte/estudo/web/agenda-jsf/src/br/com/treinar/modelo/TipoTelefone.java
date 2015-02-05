package br.com.treinar.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public enum TipoTelefone {

	COMERCIAL("Comercial"),
	PESSOAL("Pessoal"),
	RESIDENCIAL("Residencial"),
	RECADO("Recado");
	
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
	public static TipoTelefone[] valuesOrderByDescription() {
		List<TipoTelefone> tipos = Arrays.asList(values());
		Collections.sort(tipos, new Comparator<TipoTelefone>() {
			@Override
			public int compare(TipoTelefone o1, TipoTelefone o2) {
				return o1.descricao.compareTo(o2.descricao);
			}
		});
		return (TipoTelefone[]) tipos.toArray();
	}
	
}
