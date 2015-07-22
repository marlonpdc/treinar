package br.com.treinar.estudo.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Concorrencia {

	
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 20; i++) {
			numeros.add(i + 1);
		}
//		acesso concorrente		
//		for (Integer integer : numeros) {
//			if (integer > 0 && integer % 20 == 0) {
//				numeros.remove(integer);
//			}
//		}
		
		Iterator<Integer> it = numeros.iterator();
		
		while (it.hasNext()) {
			Integer integer = it.next();
			if (integer > 0 && integer % 2 == 0) {
				it.remove();
			}
		}
		System.out.println(numeros);
		
		
	}
	
	
}
