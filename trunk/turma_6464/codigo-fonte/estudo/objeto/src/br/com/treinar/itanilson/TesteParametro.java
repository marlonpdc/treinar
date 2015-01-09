package br.com.treinar.itanilson;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Pao;

public class TesteParametro {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Pao pao = aluno.comprarPao(1.5);
		System.out.println(pao.pesoEmGramas);
	}

}
