package br.com.treinar.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.treinar.agenda.dao.util.ConnectionFactory;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;

public class ContatoDAO {

	private Connection con;
	
	public ContatoDAO() {
		con = new ConnectionFactory().getConnection();
	}
	
	public void alterar(Contato contato) {
	     String sql = "update contato set nome=?, email=?, endereco=?," +
	             "dataNascimento=?";
	     try {
	         PreparedStatement stmt = con.prepareStatement(sql);
	         stmt.setString(1, contato.getNome());
	         stmt.setString(2, contato.getEmail());
	         stmt.setString(3, contato.getEndereco());
	         
	         
	         int linhasAfetadas = stmt.executeUpdate();
	         System.out.println(linhasAfetadas);
	         stmt.close();
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
	
	public void adicionar(Contato contato) throws SQLException {
	    String sqlContato = "insert into contato " +
	            "(nome, email, endereco, telefone)" +
	            " values (?, ?, ?, ?)";
	    
	    criarTelefone(contato.getTelefone());
	    Telefone t = recuperarTelefone(contato.getTelefone().getNumero(), contato.getTelefone().getDdd());
	    
	    try {
	        // prepared statement para inserção
	        PreparedStatement stmt = con.prepareStatement(sqlContato);

	        // seta os valores
	        stmt.setString(1,contato.getNome());
	        stmt.setString(2,contato.getEmail());
	        stmt.setString(3,contato.getEndereco());
	        stmt.setLong(4, t.getId());

	        // executa
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}

	private void criarTelefone(Telefone telefone) {
		String sqlTelefone = "insert into telefone " +
	    		"(ddd, numero, tipoTelefone)" +
	    		" values (?, ?, ?)";
	    try {
	        // prepared statement para inserção
	        PreparedStatement stmt = con.prepareStatement(sqlTelefone);

	        // seta os valores
	        stmt.setInt(1,telefone.getDdd());
	        stmt.setInt(2,telefone.getNumero());
	        stmt.setInt(3,telefone.getTipoTelefone().ordinal());
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public Telefone recuperarTelefone(Integer ddd, Integer numero) throws SQLException {
		String sql = "select * from telefone t where t.numero = ? and t.ddd = ?";
		PreparedStatement stmt = this.con.prepareStatement(sql);
        stmt.setInt(1, ddd);
        stmt.setInt(2, numero);
        ResultSet rs = stmt.executeQuery();
        Telefone t = new Telefone();
        if (rs.next()) {
            t.setId(rs.getLong("id"));
            t.setDdd(rs.getInt("ddd"));
            t.setTipoTelefone(TipoTelefone.values()[(rs.getInt("tipoTelefone"))]);
        }
        rs.close();
        stmt.close();
		return t;
	}
	
	public List<Contato> getLista() {
	     try {
	         List<Contato> contatos = new ArrayList<Contato>();
	         PreparedStatement stmt = this.con.prepareStatement("select * from contato c inner join telefone t on c.telefone = t.id ");
	         
	         ResultSet rs = stmt.executeQuery();
	 
	         while (rs.next()) {
	             // criando o objeto Contato
	             Contato contato = new Contato();
	             contato.setId(rs.getLong("id"));
	             contato.setNome(rs.getString("nome"));
	             contato.setEmail(rs.getString("email"));
	             contato.setEndereco(rs.getString("endereco"));
	             contato.setTelefone(new Telefone());
	             contato.getTelefone().setDdd(rs.getInt("ddd"));
	             contato.getTelefone().setNumero(rs.getInt("numero"));
	             contato.getTelefone().setTipoTelefone(TipoTelefone.values()[(rs.getInt("tipoTelefone"))]);
	 
	             // adicionando o objeto à lista
	             contatos.add(contato);
	         }
	         rs.close();
	         stmt.close();
	         return contatos;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
	
	public Contato recuperarContato(Long id) {
	     try {
	         Contato contato = new Contato();
	         PreparedStatement stmt = this.con.prepareStatement("select * from contato c inner join telefone t on c.telefone = t.id where c.id = ?");
	         stmt.setLong(1, id);
	         ResultSet rs = stmt.executeQuery();
	 
	         if(rs.next()) {
	             // criando o objeto Contato
	             contato.setId(rs.getLong("id"));
	             contato.setNome(rs.getString("nome"));
	             contato.setEmail(rs.getString("email"));
	             contato.setEndereco(rs.getString("endereco"));
	             contato.setTelefone(new Telefone());
	             contato.getTelefone().setDdd(rs.getInt("ddd"));
	             contato.getTelefone().setNumero(rs.getInt("numero"));
	             contato.getTelefone().setTipoTelefone(TipoTelefone.values()[(rs.getInt("tipoTelefone"))]);
	         }
	         rs.close();
	         stmt.close();
	         return contato;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }

	public void editar(Contato contato) {
		System.out.println();
	}
	
}
