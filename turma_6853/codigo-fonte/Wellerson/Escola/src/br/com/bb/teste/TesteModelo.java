package br.com.bb.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.bb.modelo.Aluno;
import br.com.bb.modelo.Comportamento;
import br.com.bb.modelo.IComportamento;
import br.com.bb.modelo.Pessoa;
import br.com.bb.modelo.PessoaComportamento;
import br.com.bb.modelo.Professor;

public class TesteModelo {

	public static void main(String[] args) throws IOException {
		Pessoa p = new Pessoa();
		p.setId(1L);
		p.setNome("Gleidson");
		p.setIdade(33);
		p.setComportamento(new ArrayList<PessoaComportamento>());

		PessoaComportamento pessoaAluno = new PessoaComportamento();
		pessoaAluno.setId(1l);
		IComportamento aluno = new Aluno();
		cadastrarAluno((Aluno) aluno);

		pessoaAluno.setComportamento(aluno);
		pessoaAluno.setPessoa(p);
		pessoaAluno.setTipoComportamento(Comportamento.ALUNO);

		p.getComportamento().add(pessoaAluno);

		PessoaComportamento pessoaProfessor = new PessoaComportamento();
		pessoaProfessor.setTipoComportamento(Comportamento.PROFESSOR);
		pessoaProfessor.setId(2l);
		IComportamento professor = new Professor();
		cadastrarProfessor((Professor) professor);

		pessoaProfessor.setPessoa(p);
		pessoaProfessor.setComportamento(professor);

		p.getComportamento().add(pessoaProfessor);
		
		gravarPessoa(p);

	}

	private static void cadastrarProfessor(Professor professor) {
		professor.setId(45);
		professor.setDataAdmissao(new Date());
		professor.setDisciplina("Matematica");
		professor.setQtdAulas(32);
	}

	private static void cadastrarAluno(Aluno aluno) {
		aluno.setAprovado(Boolean.TRUE);
		aluno.setClasse("Turam 2º B");
		aluno.setId(48);
		List<Double> notas = new ArrayList<>();
		notas.add(58d);
		notas.add(63d);
		notas.add(68d);
		aluno.setNotas(notas);
	}

	private static void gravarPessoa(Pessoa pessoa) throws IOException {
		OutputStream os = new FileOutputStream("pessoas.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write(pessoa.getId().toString());
		bw.write(";");
		bw.write(pessoa.getNome());
		bw.write(";");
		bw.write(pessoa.getIdade().toString());
		bw.write(";");
		bw.write(String.valueOf(pessoa.getComportamento().size()));
		bw.write(";");
		for (PessoaComportamento comportamento : pessoa.getComportamento()) {
			bw.write(comportamento.getId().toString());
			bw.write(";");		
			bw.write(comportamento.getTipoComportamento().toString());
			bw.write(";");		
			if (comportamento.getComportamento() instanceof Aluno) {	
				gravarAluno((Aluno) comportamento.getComportamento(), bw);
			} else if (comportamento.getComportamento() instanceof Professor) {		
				gravarProfessor((Professor) comportamento.getComportamento(), bw);
			}
		}
		bw.close();
	}

	private static void gravarAluno(Aluno aluno, BufferedWriter bw) throws IOException {
		bw.write(aluno.getId().toString());
		bw.write(";");
		bw.write(aluno.getClasse());
		bw.write(";");
		bw.write(String.valueOf(aluno.getNotas().size()));
		bw.write(";");
		for (Double nota : aluno.getNotas()) {
			bw.write(nota.toString());
			bw.write(";");
		}
	}
	
	private static void gravarProfessor(Professor professor, BufferedWriter bw) throws IOException {
		bw.write(professor.getId().toString());
		bw.write(";");
		bw.write(professor.getDisciplina());
		bw.write(";");
		bw.write(new SimpleDateFormat("dd/MM/yyyy").format(professor.getDataAdmissao()));
		bw.write(";");
	}

}
