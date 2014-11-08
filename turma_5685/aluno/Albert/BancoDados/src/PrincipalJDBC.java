

//import br.com.treinar.jdbc.Aluno;
//import br.com.treinar.jdbc.AlunoDAO;


public class PrincipalJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Aluno cts = new Aluno();
		
		cts.setNome("Albert");		
		cts.setEndereco("Rua onze");
		
		AlunoDAO alunoDao = new AlunoDAO();
		
		alunoDao.adicionar(cts);
		

	}

}
