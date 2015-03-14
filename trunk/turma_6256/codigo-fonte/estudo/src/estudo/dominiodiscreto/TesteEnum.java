package estudo.dominiodiscreto;

public class TesteEnum {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.SABADO;
		
		System.out.println(dia.getDescricao());
		DiaSemana segunda = DiaSemana.valueOf("SEGUNDA_FEIRA");
		
		System.out.println(segunda.getDescricao());
		
		DiaSemana[] dias = DiaSemana.values();
		
		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana);
		}

		System.out.println(dias[2]);
		
	}

}
