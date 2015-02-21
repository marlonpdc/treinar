package treinar;

public class TesteOO {

	public static void main(String[] args) {
		Professor prof;
		
		prof = new Professor();
		prof.nome = "Gleidson";
		prof.idade = 34;
		prof.email = "gleidson.gmoura@gmail.com";
		
		Aluno aluno = new Aluno();
		aluno.idade = 25;
		aluno.matricula = 10481;
		aluno.nome = "Daniel";
		
		Curso curso = new Curso();
		curso.nome = "Java Básico";
		curso.horasAula = 32;
		curso.professor = prof;
		curso.aluno = aluno;
		
		//TODO - imprimir o nome do professor e do aluno
		
		System.out.println("Curso: " + curso.nome);
		System.out.println("Professor: " + curso.professor.nome);
		System.out.println("Aluno: " + curso.aluno.nome);
		
		Aluno outro = new Aluno();
		outro.nome = "Maria";
		outro.idade = 23;
		outro.matricula = 1234;
		
		aluno = null;
		
		curso.aluno = outro;
		System.out.println("Aluno: " + curso.aluno.nome);
		
		
	}
	
}
