package br.com.treinar.atividade;

public class Atividadeif {
	public static void main(String[] args) {
	 
		int h  = 2;
		String oi;
		
		if (h >= 12) {
			System.out.println("bom tarde");
		} else {
			System.out.println("bom dia");
		}
		
		h = 20;
		 oi = h < 12 ? "bom dia !" : "boa tarde";
		 boolean humor = false;
		 
		 System.out.println(oi);
		 System.out.println( h < 12 && humor ? "bom dia!" : "bom tarde");
		 
	}
  
	
}
