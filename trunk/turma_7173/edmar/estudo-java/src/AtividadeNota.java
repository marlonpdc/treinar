public class AtividadeNota {

	public static void main(String[] args) {

		int nota = 40;
		String resultado;

		System.out.println(resultado = nota > 60 ? "Aprovado" : "Reprovado");

		nota = 60;
		resultado = "";

		if (nota < 40) {
			resultado = "Reprovado";
		} else if (nota >= 40 && nota < 60) {
			resultado = "Recuperação";
		} else {
			resultado = "Aprovado";
		}

		System.out.println(resultado);

	}
}
