package br.com.bb.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import br.com.bb.modelo.Aluno;
import br.com.bb.modelo.Comportamento;
import br.com.bb.modelo.Pessoa;
import br.com.bb.modelo.PessoaComportamento;
import br.com.bb.modelo.Professor;

public class TesteCriaPessoa {

	public static void main(String[] args) throws IOException, ParseException {
		InputStream is = new FileInputStream("pessoas.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine();
		String[] campos = null;
		Pessoa p = null;
		Integer qtdComportamentos = null;
		PessoaComportamento pc = null;
		Integer contCampos = 0;
		while (s != null) {
			campos = s.split(";");
			p = new Pessoa();
			p.setId(Long.parseLong(campos[contCampos++]));
			p.setNome(campos[contCampos++]);
			p.setIdade(Integer.parseInt(campos[contCampos++]));
			p.setComportamento(new ArrayList<PessoaComportamento>());
			qtdComportamentos = Integer.valueOf(campos[contCampos++]);
			for (int i = 0; i < qtdComportamentos; i++) {
				pc = new PessoaComportamento();
				pc.setId(Long.valueOf(campos[contCampos++]));
				pc.setPessoa(p);
				pc.setTipoComportamento(Comportamento.valueOf(campos[contCampos++]));
				switch (pc.getTipoComportamento()) {
				case ALUNO:
					contCampos += criarAluno(campos, contCampos, pc);
					break;
					
				case PROFESSOR:
					contCampos += criarProfessor(campos, contCampos, pc);
					break;

				default:
					break;
				}
				p.getComportamento().add(pc);
			}
			System.out.println(s);
			s = br.readLine();
		}

		br.close();
		
		System.out.println(p);
	}
	
	private static Integer criarAluno(String[] campos, Integer contCampos, PessoaComportamento pessoaComportamento) {
		Integer qtdPassos = 0;
		Aluno a = new Aluno();
		a.setId(Integer.parseInt(campos[contCampos++]));
		qtdPassos++;
		a.setClasse(campos[contCampos++]);
		qtdPassos++;
		Integer qtdNotas = Integer.parseInt(campos[contCampos++]);
		qtdPassos++;
		a.setNotas(new ArrayList<Double>());
		for (int i = 0; i < qtdNotas; i++) {
			a.getNotas().add(Double.parseDouble(campos[contCampos++]));
			qtdPassos++;
		}
		pessoaComportamento.setComportamento(a);
		return qtdPassos;
	}

	private static Integer criarProfessor(String[] campos, Integer contCampos, PessoaComportamento pessoaComportamento) throws ParseException {
		Integer qtdPassos = 0;
		Professor p = new Professor();
		p.setId(Integer.parseInt(campos[contCampos++]));
		qtdPassos++;
		p.setDisciplina(campos[contCampos++]);
		qtdPassos++;
		p.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse(campos[contCampos++]));
		qtdPassos++;
		pessoaComportamento.setComportamento(p);
		return qtdPassos;
	}

}
