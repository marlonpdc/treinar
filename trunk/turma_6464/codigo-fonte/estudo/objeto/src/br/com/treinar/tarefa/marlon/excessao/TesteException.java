package br.com.treinar.tarefa.marlon.excessao;

public class TesteException {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Aluno aluno = null;
		
		try {
			System.out.println("Código: " + aluno.getCodigo() + "Nome: " + aluno.getNome());
		}
		
		catch (NullPointerException e) {
			
			System.out.println("Tratando Exceção: " + e);
		}
		
		System.out.println("Programa Finalizado...");
	}
}
