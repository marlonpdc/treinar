package br.com.treinar.tarefa.Leandro;

public class TratamentoExececoes {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Aluno xAluno = null;
		
		try {
			System.out.println("Nome: " + xAluno.getNome());		
		} catch (Exception e) {
			System.out.println("\n\tErro: " + e);
		}		
	}
}
