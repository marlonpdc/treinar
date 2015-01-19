package br.com.treinar.tarefa.marlon;

public class TesteString {
	public static void main(String[] args) {
		String nome = "Marlon";
		//String nome1 = "Marlon";
		
		StringBuilder sb = new StringBuilder();
		StringBuffer sf = new StringBuffer();
		
		for (int i = 0; i < 1000; i++) {
			//sb.append(nome);
			sb.append(nome).append(" ");
			sb.append(i + 1);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
