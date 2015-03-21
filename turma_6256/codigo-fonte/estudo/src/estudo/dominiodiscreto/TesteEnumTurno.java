package estudo.dominiodiscreto;

public class TesteEnumTurno {

	public static void main(String[] args) {
		System.out.println(Turno.TARDE);
		System.out.println(Turno.TARDE.ordinal());
		String nomeTurno = "NOITE";
		Turno n = Turno.valueOf(nomeTurno);
		System.out.println(n.ordinal());
		//todos os itens do enum
		System.out.println("---------------");
		Turno[] turnos = Turno.values();
		for (Turno turno : turnos) {
			System.out.println(turno.ordinal() + " - " + turno);
		}
		
		
		
	}
	
}
