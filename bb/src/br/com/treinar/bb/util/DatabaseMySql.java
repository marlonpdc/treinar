package br.com.treinar.bb.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.ContaInvestimento;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.ContaSalario;
import br.com.treinar.bb.modelo.banco.BBException;
import br.com.treinar.bb.modelo.banco.Conta;

public class DatabaseMySql implements IDatabase {

	private static DatabaseMySql database;
	private Connection con;
	
	
	private DatabaseMySql() {
		
	}
	
	static {
		database = new DatabaseMySql();
	}
	
	public static DatabaseMySql getInstance() {
		return database;
	}
	
	@Override
	public void inserirConta(Conta conta) throws BBException {
		con = ConnectionFactory.getConnection();
		PreparedStatement stmt;
		try {
			con.setAutoCommit(Boolean.FALSE);
			// cria um preparedStatement
			String sql = "insert into cliente (cpf, nome) values (?, ?)";
			stmt = con.prepareStatement(sql);
			stmt.setLong(1, conta.getCliente().getCpf());
			stmt.setString(2, conta.getCliente().getNome());		
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			Long codCliente = null;
			if (rs.next()) {
				codCliente = rs.getLong(1);
			}
			if (codCliente != null) {
				conta.getCliente().setCodigo(codCliente);
				if (conta instanceof ContaCorrente) {
					inserirConta((ContaCorrente) conta, con);
				} else if (conta instanceof ContaPoupanca) {
					inserirConta((ContaPoupanca) conta);
					
				} else if (conta instanceof ContaSalario) {
					inserirConta((ContaSalario) conta);
					
				} else if (conta instanceof ContaInvestimento) {
					inserirConta((ContaInvestimento) conta);
				}				
			}
			stmt.close();
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new BBException();
		}

	}

	public void inserirConta(ContaCorrente conta, Connection con) throws BBException, SQLException {
		PreparedStatement stmt;
		String sql = "insert into conta" +
	                " (cliente, limiteCredito, saldo, situacao, taxaManutencao)" +
	                " values (?, ?, ?, ?, ?)";
		stmt = con.prepareStatement(sql);
		stmt.setLong(1, conta.getCliente().getCodigo());
		stmt.setDouble(2, conta.getLimiteCredito());
		stmt.setDouble(3, conta.recuperarSaldo() - conta.getLimiteCredito());
		stmt.setInt(4, conta.getSituacao().ordinal());
		stmt.setDouble(5, conta.getTaxaManutencao());
		
		stmt.execute();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			conta.setCodigoConta(rs.getLong(1));
		}
		throw new BBException();
		
	}
	
	public void inserirConta(ContaPoupanca conta) throws BBException {
		
	}
	
	public void inserirConta(ContaSalario conta) throws BBException {
		
	}
	
	public void inserirConta(ContaInvestimento conta) throws BBException {
		
	}
	
	
	@Override
	public Conta selecionar(Long codigoConta) {
		return null;
	}

	@Override
	public Conta[] getContas() {
		return null;
	}

}
