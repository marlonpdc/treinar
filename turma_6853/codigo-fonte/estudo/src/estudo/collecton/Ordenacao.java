package estudo.collecton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenacao {

	public static void main(String[] args) {
		
		String[] nomesStaticArray = {"Gleidson", "Sophia", "Amanda", "Aline", "Gabriel"};
		
		List<String> nomes = Arrays.asList(nomesStaticArray);
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		Collections.reverse(nomes);
		
		System.out.println(nomes);
		
		
	}
	
}
