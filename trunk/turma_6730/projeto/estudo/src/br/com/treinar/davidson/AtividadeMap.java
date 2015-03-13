package br.com.treinar.davidson;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class AtividadeMap {
	public static void main (String args[]){


		Map<String,String> example = new HashMap<String,String>();
		example.put( "K1", new String( "Davidson" ));
		example.put( "K2", new String( "Kajsa" ));
		example.put( "K3", new String( "Maria" ));
		example.put( "K4", new String( "Andreza" ));
		example.put( "K5", new String( "Izabella" ));
		example.put( "K6", new String( "Dyane" ));
		example.put( "K7", new String( "Christian" ));
		example.put( "K8", new String( "Patricia" ));
		example.put( "K9", new String( "Fernanda" ));
		example.put( "K10", new String( "Evelyn" ));
		example.put( "K11", new String( "Juliana" ));          
		example.put( "K12", new String( "Vinicius" ));
		example.put( "K13", new String( "Ana Julia" ));
		example.put( "K14", new String( "Vera" ));
		example.put( "K15", new String( "Geraldo" ));
		example.put( "K16", new String( "Romulo" ));
		
		//example.entrySet() + alr +Shift + L
		Set<Entry<String, String>> entrySet = example.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getValue());
		}
		

	}

}