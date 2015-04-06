package estudo.collecton;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		
		
	}
	
}
