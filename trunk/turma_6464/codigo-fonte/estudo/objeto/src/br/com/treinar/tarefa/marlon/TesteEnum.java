package br.com.treinar.tarefa.marlon;

//import javax.swing.JOptionPane;

public class TesteEnum {
	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.getOrdinal(5);
		
		System.out.println(dia);
		System.out.println(dia.ordinal());
		System.out.println(dia.getComercial());
		System.out.println(dia.getDescricao());
		
		
	}

}
