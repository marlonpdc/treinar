package estudo.modelo.heranca;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Funcionaro f = new Secretaria();
		f.setNome("Aline");
		f.setDataNascimento(new Date());
		((Secretaria)f).setUniforme("Jaleco");
		
		System.out.println(f.getClass().getSimpleName());
		
		promover(f);

		System.out.println(f.getClass().getSimpleName());

	}

	private static void promover(Funcionaro f) {
		Funcionaro temp = new Funcionaro();
		temp.setNome(f.getNome());
		temp.setDataNascimento(f.getDataNascimento());
		f = new Gerente();
		f.setDataNascimento(temp.getDataNascimento());
		f.setNome(temp.getNome());
		((Gerente)f).setBonificacao(1000D);
	}
	
}
