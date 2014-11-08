import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
	
	private Connection connectionBase;
	
	public AlunoDAO() {
		this.connectionBase = new ConnectionBaseFactory().getConnection();
	}
	
	public void adicionar(Aluno contato) {
		//Comando para inserção de dados
	    String sql = "insert into alunos " +
			            "(nomeAluno, enderecoAluno)" +
			            	" values (?,?)";
	    try {
	        
	        PreparedStatement stmt = connectionBase.prepareStatement(sql);	 

	        stmt.setString(1, contato.getNome());	        
	        stmt.setString(2, contato.getEndereco());	        
	     
	        //executa comando de inserção
	        stmt.execute();
	        stmt.close();
	        
	        
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}

}
