
import java.util.ArrayList;
import java.util.List;


public class ListaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlunoTreinar alunoTreinar = new AlunoTreinar();
		
		alunoTreinar.setNome("Albert");
		alunoTreinar.setCpf(123);
		
		List<String> lista = new ArrayList<>();
		lista.add(alunoTreinar.toString());
		
		System.out.print(lista.get(0));
		
		
		
		
	}

}
