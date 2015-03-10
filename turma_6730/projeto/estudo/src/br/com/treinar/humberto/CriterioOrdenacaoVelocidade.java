package br.com.treinar.humberto;

import java.util.Comparator;

public class CriterioOrdenacaoVelocidade implements Comparator<Atleta>{

	public int compare(Atleta o1, Atleta o2) {
		// se velocidade for Wrapper (Integer no lugar de int)
		// return o1.velocidade.compareTo(o2.velocidade);
		return o1.velocidade - o2.velocidade ;
	}
	

}
