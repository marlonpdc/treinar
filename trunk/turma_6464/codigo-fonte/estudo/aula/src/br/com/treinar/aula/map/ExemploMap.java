package br.com.treinar.aula.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ExemploMap {

	public static void main(String[] args) {
		
		Map<Integer, MensagemErro> msg = new HashMap<>();
		
		MensagemErro erro202 = new MensagemErro();
		erro202.setCategoria("A");
		erro202.setCodigo(202);
		erro202.setMsg("Digite todos os campos");
		erro202.setPop("bla bla bla");
		
		MensagemErro erro203 = new MensagemErro();
		erro203.setCategoria("E");
		erro203.setCodigo(203);
		erro203.setMsg("Campo inválido");
		erro203.setPop("bla bla bla invalido");
		
		msg.put(erro202.getCodigo(), erro202);
		msg.put(erro203.getCodigo(), erro203);
		//a chave deve ser unica
		//msg.put(203, erro203);
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> keys = msg.keySet();
		for (Integer key : keys) {
			MensagemErro mensagemErro = msg.get(key);
			System.out.println("Mensage " + mensagemErro.getCodigo() + " - " + mensagemErro.getMsg());
		}
		
		for (Entry<Integer, MensagemErro> entry : msg.entrySet()) {
			System.out.println("Mensage " + entry.getKey() + " - " + entry.getValue().getMsg());
		}
		
		System.out.print("Informe o código da mensagem: ");
		Integer codigo = sc.nextInt();
		sc.close();
		MensagemErro erro = msg.get(codigo);
		
		System.out.println(erro);
		
	}
	
}
