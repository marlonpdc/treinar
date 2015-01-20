package br.com.treinar.tarefa.fernando;

public class TesteEnum {
	
	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia);
		System.out.println(dia.ordinal());
		System.out.println(dia.getComercial());
		System.out.println(dia.getDescricao());
		
	}

}
