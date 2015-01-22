package br.com.treinar.tarefa.charles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.treinar.escola.modelo.Pessoa;

public class OrdenaListas {

	
	public static void main(String[] args) {
		
		
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
		  
		  Collections.sort(nome);
		  
		  Set<Pessoa> alunos = new HashSet<Pessoa>();
	}
}
