package br.com.treinar.estudo.dominiodiscreto;

public class TesteEnum {
	
	public static void main(String[] args) {
		System.out.println(DiaSemana.DOM.ordinal());
		String dia = "DOM";
		
		DiaSemana ds = DiaSemana.valueOf(dia);
		
		System.out.println(ds);
		
		System.out.println(DiaSemana.getByIndex(0).getDescricao());
		
		
		
	}
	
}
