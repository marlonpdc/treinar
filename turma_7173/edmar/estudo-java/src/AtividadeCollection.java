import java.util.ArrayList;
import java.util.Collection;

public class AtividadeCollection {

	public static void main(String[] args) {

		Collection<DiaSemana> dias = new ArrayList<>();

		dias.add(DiaSemana.SEGUNDA_FEIRA);
		dias.add(DiaSemana.TERCA_FEIRA);
		dias.add(DiaSemana.QUARTA_FEIRA);
		dias.add(DiaSemana.QUINTA_FEIRA);
		dias.add(DiaSemana.SEXTA_FEIRA);
		dias.add(DiaSemana.SABADO);
		dias.add(DiaSemana.DOMINGO);
		
		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana);
		}
		

	}

}
