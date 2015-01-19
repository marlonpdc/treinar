package br.com.treinar.tarefa.charles;

public class TesteString {
	
	public static void main(String [] args){
	
		String nome = "Charles";
		String nome1 = "Charles";
		
		//É mais rápido que o StringBuffer e mais utilizado.
		StringBuilder sb = new StringBuilder();
		
		//Libera acesso concorrente, quando duas pessoas ou mais estão trabalhando no mesmo código
		StringBuffer sf = new StringBuffer();
	
		for(int i = 0; i < 1000; i++){
		   //nome += nome + (i + 1) + " ";
		   sb.append(nome).append(" ");
		   sb.append(nome).append(" ");
		   sb.append(i + 1);
		   sb.append("\n");
		   
		   sf.append(nome1).append(" ");
		   
		}
	
			System.out.println(sb.toString());
			System.out.println(sf.toString());
	
	}

}
