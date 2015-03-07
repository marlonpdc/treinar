package br.com.treinar.estudo.tipodado;

public class TesteEnum {

	public static void main(String[] args) {
		
		Mes jan = Mes.JANEIRO;
		Mes dez = Mes.DEZEMBRO;
		
		
		
		System.out.println(jan);
		System.out.println(dez);
		System.out.println(dez.ordinal());
		
		
		String descricaoMes = "Abril";
		Mes abr = Mes.valueOf(descricaoMes.toUpperCase());
		Mes porOrdinal = Mes.recuperarPorOrdinal(2);
		System.out.println(porOrdinal);
		System.out.println(abr.ordinal());
		
		
		Mes[] meses = Mes.values();
		
		System.out.println(meses[1]);
		
		
		for (Mes mes : meses) {
			System.out.println(mes);
		}
		
		
	}
	
}
