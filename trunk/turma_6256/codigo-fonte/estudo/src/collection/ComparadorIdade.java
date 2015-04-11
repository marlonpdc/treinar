package collection;

import java.util.Comparator;

public class ComparadorIdade implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getIdade().compareTo(o2.getIdade());
	}

}
