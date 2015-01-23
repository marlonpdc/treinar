package br.com.treinar.tarefa.marlon.excessao;

public class IndiceInvalido {

	public static void main(String[] args) throws Exception {
		try{
			metodoUm();		
		}
		catch (Exception e){
			System.out.println("Erro");
		}
		System.out.println("Fim do programa");
	}

	private static void metodoUm() throws Exception {
		@SuppressWarnings("unused")
		Integer[] num = new Integer[2];
		Integer.parseInt("A");
	}
}
