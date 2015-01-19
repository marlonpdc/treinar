package br.com.treinar.tarefa.charles;
		
public class TestaDiaSemana {

	public static void main(String[] args) {


		DiaSemana dia = DiaSemana.getByOrdinal(6);
		System.out.println(dia);
		System.out.println(dia.ordinal());
		System.out.println(dia.getComercial());
		System.out.println(dia.getDescricao());
		
			
	}

}
