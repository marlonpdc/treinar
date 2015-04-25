package br.com.agenda.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public enum TipoTelefone {

	RESIDENCIAL("Residencial"),
	CELULAR("Celular"),
	COMERCIAL("Comercial"),
	RECADO("Recado");
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	public static List<TipoTelefone> valuesOrderByDescription() {
		List<TipoTelefone> tipoTelefones = Arrays.asList(values());
		Collections.sort(tipoTelefones, new Comparator<TipoTelefone>() {
			@Override
			public int compare(TipoTelefone o1, TipoTelefone o2) {
				return o1.getDescricao().compareTo(o2.getDescricao());
			}
		});
		return tipoTelefones;
	}
	
}
