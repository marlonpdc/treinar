package estudo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSelect {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		String sql = "select nome as nomeContato from contato where nome like ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		// executa um select
		stmt.setString(1, "a%");
		ResultSet rs = stmt.executeQuery();
		
		
		// itera no ResultSet
		while (rs.next()) {
			String caixa = rs.getString("nomeContato");
			//String email = rs.getString("email");

			System.out.println(caixa);
		}

		stmt.close();
		con.close();
	}

}
