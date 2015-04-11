package gilberto.compisacao;

import java.util.Date;

import estudo.modelo.composicao.Funcionaro;
import estudo.modelo.composicao.Gerente;
import estudo.modelo.composicao.Secretaria;

public class ExercicioComposicao {

	public static void main(String[] args) {

		Funcionaro f = new  Funcionaro();
		f.setNome("Gilberto");
		f.setDataNascimento(new Date());
		Secretaria s = new Secretaria();
		s.setSalario(1000D);
		s.setSetor("Recepção");
		s.setUniforme("jaleco");
		f.setFuncao(s);
		
		System.out.println(((Secretaria) f.getFuncao()).getClass().getSimpleName());
		
		promoverGerente(f);
		System.out.println(((Gerente) f.getFuncao()).getClass().getSimpleName());
		
	}

	private static void promoverGerente(Funcionaro f) {
		Gerente g = new Gerente();
		g.setBonificacao(2000D);
		g.setSalario(3000D);
		g.setSetor("Diretoria");
		f.setFuncao(g);
	}

}
