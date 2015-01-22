package br.com.treinar.tarefa.Caio;

public class TratamentoDeErro {

	private Integer[] idades = new Integer[5];
	
	public static void main(String[] args) {
		TratamentoDeErro.setIdade(5);
	}
	
	public static void setIdade(Integer vidade){
		try{
			
		}
		catch(NullPointerException ex){
			System.out.println(ex.toString());
		}
	}

}
