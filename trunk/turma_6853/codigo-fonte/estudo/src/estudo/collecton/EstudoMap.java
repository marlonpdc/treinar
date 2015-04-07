package estudo.collecton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

import estudo.objeto.Pessoa;

public class EstudoMap {

	public static void main(String[] args) {
		Map<String, Pessoa> mapPessoas = new HashMap<String, Pessoa>();
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		p1.setNome("Gleidson");
		p2.setNome("Maria Sophia");
		p3.setNome("Nathalia");
		
		mapPessoas.put("Gleidson", p1);
		mapPessoas.put("Maria Sophia", p2);
		mapPessoas.put("Nathalia", p3);
		
		
		Pessoa p4 = mapPessoas.get("Gleidson");
		System.out.println(p4);
		
		String nome = "Gleidosn";
		
		System.out.println(nome.substring(0,1));
		
		System.out.println(nome.charAt(0));
		
		mapPessoas.containsKey("Gleidosn");
		
		Set<String> keys = mapPessoas.keySet();
		
		for (String key : keys) {
			System.out.println(mapPessoas.get(key));
		}
		
		
		Set<Entry<String, Pessoa>> entrySet = mapPessoas.entrySet();
		
		for (Entry<String, Pessoa> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		System.out.println(keys);
		
		SortedMap<String, Pessoa> myMap = new SortedMap<String, Pessoa>();
		
		List<Pessoa> lista = new ArrayList<>();
		
		Pessoa gle  = new Pessoa("Gleidson");
		Pessoa a  = new Pessoa("Amanda");
		Pessoa b  = new Pessoa("Sohpie");
		Pessoa c  = new Pessoa("Adriano");
		Pessoa d  = new Pessoa("Geraldo");
		
		myMap.put(gle.getNome(), gle);
		myMap.put(a.getNome(), a);
		myMap.put(b.getNome(), b);
		myMap.put(c.getNome(), c);
		myMap.put(d.getNome(), d);
		
		Set<Entry<String, Pessoa>> entrySet2 = myMap.entrySet();
		
		for (Entry<String, Pessoa> entry : entrySet2) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
}
