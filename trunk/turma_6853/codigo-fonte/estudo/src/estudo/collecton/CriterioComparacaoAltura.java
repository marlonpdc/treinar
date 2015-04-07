package estudo.collecton;

import java.util.Comparator;

import estudo.objeto.Pessoa;

public class CriterioComparacaoAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getAltura().compareTo(o2.getAltura());
	}

}
