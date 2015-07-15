package estudo.dominiodiscreto;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana s = DiaSemana.SABADO;
		
		System.out.println("Enum");
		System.out.println(s);
		
		String dia = "DOMINGO";
		DiaSemana diaX = DiaSemana.valueOf(dia);
		System.out.println("valueOf()");
		System.out.println(diaX);
		
		DiaSemana[] dias = DiaSemana.values();
		
		
		System.out.println("values()");
		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana);
		}
				
		System.out.println("ordinal()");
		System.out.println(diaX.ordinal());
		
		
	}
	
}
