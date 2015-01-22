package br.com.treinar.tarefa.charles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ListaNomes {
	
	public static void main(String[] args) {
		
		//Map é a api de apoio para separar os nomes da lista
		Map<String, List<String>> Turma = new HashMap<>();
		
		List<String> nome = new ArrayList<>();
		  nome.add("Antônio");
		  nome.add("Amaral" + "\n");
		  nome.add("Bruno");
		  nome.add("Barbara" + "\n");
		  nome.add("Carla");
		  nome.add("Charles" + "\n");
		  nome.add("Daniel");
		  nome.add("Daniela" + "\n");
		  nome.add("Eduarda");
		  nome.add("Eduardo" + "\n");
		  
		  String Argumento = null;
		  	for(String nomes: nome){
		  		
		  		Argumento = nomes.substring(0, 1);
		  		
		  		if(!Turma.containsKey(Argumento)){
		  			
		  			Turma.put(Argumento, new ArrayList<String>());
		  		}
		  		
		 
		  		   Turma.get(Argumento).add(nomes);
				    
	}
		  	System.out.println(Turma);
		  
  }

}
