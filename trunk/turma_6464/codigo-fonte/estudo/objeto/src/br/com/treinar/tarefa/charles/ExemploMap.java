package br.com.treinar.tarefa.charles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ExemploMap {
	
	public static void main(String[] args) {
		
		
		Map<Integer, MensagemErro> msg = new HashMap<>();
		
		MensagemErro erro202 = new MensagemErro();
		erro202.setCategoria("A");
		erro202.setCodigo(202);
		erro202.setMsg("Você deve preencher todos os campos");
		erro202.setPop("bla, bla, bla");
		
		MensagemErro erro203 = new MensagemErro();
		erro203.setCategoria("A");
		erro203.setCodigo(203);
		erro203.setMsg("Você deve preencher todos os campos");
		erro203.setPop("bla, bla, bla");
		
		msg.put(erro202.getCodigo(), erro202);
		msg.put(erro203.getCodigo(), erro203);
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> Keys = msg.keySet();
		
		for(Integer key: Keys){
			//System.out.println("Mensagem " + MensagemErro.getCodigo() + " - " + );
			
		}
		
		System.out.println("Informe o código da mensagem: ");
		
		
	}

}
