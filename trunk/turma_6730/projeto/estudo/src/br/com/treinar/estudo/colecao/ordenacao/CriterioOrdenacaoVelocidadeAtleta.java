package br.com.treinar.estudo.colecao.ordenacao;

import java.util.Comparator;

import br.com.treinar.estudo.modelo.Atleta;

public class CriterioOrdenacaoVelocidadeAtleta implements Comparator<Atleta> {

	public int compare(Atleta o1, Atleta o2) {
		return o1.velocidade.compareTo(o2.velocidade);
	}

}
