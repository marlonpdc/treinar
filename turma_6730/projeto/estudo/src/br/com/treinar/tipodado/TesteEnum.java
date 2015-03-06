package br.com.treinar.tipodado;

public class TesteEnum {

	public static void main(String[] args) {
		
		Mes jan = Mes.JANEIRO;
		Mes dez = Mes.DEZEMBRO;
		
		System.out.println(jan);
		System.out.println(dez);
		System.out.println(dez.ordinal());
		
		
		String descricaoMes = "AbRiL";
		Mes abr = Mes.valueOf(descricaoMes.toUpperCase());
		System.out.println(abr.ordinal());
		
		
		Mes[] meses = Mes.values();
		
		System.out.println(meses[1]);
		
		
		for (Mes mes : meses) {
			System.out.println(mes);
		}
		
		
	}
	
}
