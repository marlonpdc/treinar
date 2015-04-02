package br.com.bb.teste;

import java.util.ArrayList;
import java.util.Date;

import br.com.bb.modelo.Aluno;
import br.com.bb.modelo.IComportamento;
import br.com.bb.modelo.Pessoa;
import br.com.bb.modelo.PessoaComportamento;
import br.com.bb.modelo.Professor;

public class TesteModelo {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Gleidson");
		p.setIdade(33);
		p.setComportamento(new ArrayList<PessoaComportamento>());
		
		PessoaComportamento pessoaaAluno = new PessoaComportamento();
		IComportamento aluno = new Aluno();
		
		pessoaaAluno.setComportamento(aluno);
		pessoaaAluno.setPessoa(p);
		
		p.getComportamento().add(pessoaaAluno);
		
		PessoaComportamento pessoaProfessor = new PessoaComportamento();
		IComportamento professor = new Professor();
		cadastrarProfessor((Professor) professor);
		
		pessoaProfessor.setPessoa(p);
		pessoaProfessor.setComportamento(professor);
		
		p.getComportamento().add(pessoaProfessor);
		
	}
	
	private static void cadastrarProfessor(Professor professor) {
		professor.setDataAdmissao(new Date());
		professor.setDisciplina("Matematica");
		professor.setQtdAulas(32);
	}
	
}
