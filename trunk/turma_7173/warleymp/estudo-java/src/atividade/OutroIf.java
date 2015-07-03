package atividade;

public class OutroIf {

	public static void main(String[] args) {
		int hora = 22;
		if (hora < 12) {
			System.out.println("Boa dia são " + hora + " horas");
		} else if (hora >= 12 && hora < 18) {
				System.out.println("Boa tarde são " + hora + " horas");
			} else {
				System.out.println("Bom noite são " + hora + " horas");
			}
		}
		
	
}
