package br.com.treinar.tarefa.matheus.exeption;

public class TesteExeption {

	public static void main(String[] args) throws Exception {
		
			
		
		try {
			teste();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("endereco nao exitente na matriz");
		} catch (NullPointerException e) {
			System.out.println("erro de null poiter exception");
		} catch (Exception e) {
			System.out.println("erro fatal");
		}
		
		
	}
	public static String teste() throws RuntimeException{
		
		Pessoa p = null;	
		System.out.println(p.nome);
		
		Integer[] vetor = new Integer[2];
		System.out.println(vetor[2]);
		
		return null;
		
	}
	
	
}

