package treinar;

public class TesteOO {

	public static void main(String[] args) {
		Professor prof;
		System.out.println("alguma coisa");
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
		
		//TODO - imprimir o nome do professor e do aluno
		
	}
	
}
