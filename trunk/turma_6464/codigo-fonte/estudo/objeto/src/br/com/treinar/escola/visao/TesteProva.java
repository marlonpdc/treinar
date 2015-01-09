package br.com.treinar.escola.visao;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Prova;

public class TesteProva {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		Prova p = new Prova();
		p.questao = "Quanto eh um mais um?";
		
		a.fazerProva(p);
		
		//p.correta = (p.resposta == "2");
		
		if (p.resposta.equals("2")) {
			p.correta = Boolean.TRUE;
		} else {
			p.correta = Boolean.FALSE;			
		}
		
		
		if (p.correta) {
			System.out.println("Resposta correta!");
		} else {
			System.out.println("Resposta Errada!");			
		}
		
		String resposta = p.correta ? "Resposta Correta!" : "Resposta Errada!";
		
		System.out.println(resposta); 
		
		
	}
	
}
