
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlunoTreinar alunoTreinar = new AlunoTreinar();
		alunoTreinar.setNome("bbbbbbb");
		alunoTreinar.setCpf(123);
		
		AlunoTreinar alunoTreinar2 = new AlunoTreinar();
		alunoTreinar2.setNome("aaaaaaaaaaa");
		alunoTreinar2.setCpf(123);
		
		List<AlunoTreinar> lista = new ArrayList<>();
		lista.add(alunoTreinar);
		lista.add(alunoTreinar2);
		
		Collections.sort(lista);
		
		for (AlunoTreinar a : lista) {
						
			System.out.println(a);
			
		}
				
		
		
	}

}
