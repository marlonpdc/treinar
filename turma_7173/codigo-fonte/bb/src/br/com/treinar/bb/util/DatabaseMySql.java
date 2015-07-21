package br.com.treinar.bb.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.ContaInvestimento;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.ContaSalario;
import br.com.treinar.bb.modelo.SituacaoConta;
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
			stmt.close();
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
			con.commit();
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new BBException();
		}

	}

	public void inserirConta(ContaCorrente conta, Connection con)
			throws BBException, SQLException {
		PreparedStatement stmt;
		String sql = "insert into conta"
				+ " (cliente, limiteCredito, saldo, situacao, taxaManutencao, discriminador)"
				+ " values (?, ?, ?, ?, ?, ?)";
		stmt = con.prepareStatement(sql);
		stmt.setLong(1, conta.getCliente().getCodigo());
		stmt.setDouble(2, conta.getLimiteCredito());
		stmt.setDouble(3, conta.recuperarSaldo() - conta.getLimiteCredito());
		stmt.setInt(4, conta.getSituacao().ordinal());
		stmt.setDouble(5, conta.getTaxaManutencao());
		stmt.setInt(6, 1);

		stmt.execute();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			conta.setCodigoConta(rs.getLong(1));
		}

	}

	public void inserirConta(ContaPoupanca conta) throws BBException {

	}

	public void inserirConta(ContaSalario conta) throws BBException {

	}

	public void inserirConta(ContaInvestimento conta) throws BBException {

	}

	@Override
	public Conta selecionar(Long codigoConta) throws BBException {

		PreparedStatement stmt;
		String sql = "SELECT ct.discriminador, ct.codigoConta, "
				+ "ct.situacao, ct.saldo, c.nome, c.cpf, "
				+ "c.codigo, ct.taxaManutencao, ct.limiteCredito "
				+ "FROM conta ct left join cliente c on "
				+ "c.codigo = ct.cliente where ct.codigoConta = ?";
		try {
			Conta conta = null;
			stmt = con.prepareStatement(sql);
			stmt.setLong(1, codigoConta);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Integer tipo = rs.getInt("discriminador");
				conta = criarConta(tipo, rs);
			}
			stmt.close();

			return conta;

		} catch (Exception e) {
			BBException bbException = new BBException();
			bbException.setCodigoErroNegocio("erro conexao");
			throw bbException;
		}
	}

	@Override
	public Conta[] getContas() throws BBException {
		List<Conta> contas = new ArrayList<>();
		con = ConnectionFactory.getConnection();
		PreparedStatement stmt;
		String sql = "SELECT ct.discriminador, ct.codigoConta, "
				+ "ct.situacao, ct.saldo, c.nome, c.cpf, "
				+ "c.codigo, ct.taxaManutencao, ct.limiteCredito "
				+ "FROM conta ct left join cliente c on "
				+ "c.codigo = ct.cliente";
		try {
			stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Integer tipo = rs.getInt("discriminador");
				contas.add(criarConta(tipo, rs));
			}

			Conta[] contasArray = new Conta[contas.size()];
			for (int i = 0; i < contas.size(); i++) {
				contasArray[i] = contas.get(i);
			}
			return contasArray;

		} catch (Exception e) {
			BBException bbException = new BBException();
			bbException.setCodigoErroNegocio("erro conexao");
			throw bbException;
		}
	}

	public void editarConta(Conta conta) throws BBException {
		try {
			if (conta instanceof ContaCorrente) {
				editarConta((ContaCorrente) conta);
			} else if (conta instanceof ContaPoupanca) {
				editarConta((ContaPoupanca) conta);
			} else if (conta instanceof ContaSalario) {
				editarConta((ContaSalario) conta);
			} else if (conta instanceof ContaInvestimento) {
				editarConta((ContaInvestimento) conta);
			}
		} catch (Exception e) {
			throw new BBException();
		}
	}

	private void editarConta(ContaCorrente conta) throws Exception {
		String sql = "update conta set situacao = ?, taxaManutencao = ?, "
				+ "limiteCredito = ? where   codigoConta = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, conta.getSituacao().ordinal());
		stmt.setDouble(2, conta.getTaxaManutencao());
		stmt.setDouble(3, conta.getLimiteCredito());
		stmt.setLong(4, conta.getCodigoConta());
		stmt.executeUpdate();
		stmt.close();
				
	}
	
	private void editarConta(ContaPoupanca conta) {
		
	}
	
	private void editarConta(ContaInvestimento conta) {
		
	}
	
	private void editarConta(ContaSalario conta) {
		
	}
	
	private Conta criarConta(Integer tipo, ResultSet rs) throws Exception {

		Conta c = null;
		switch (tipo) {
		case 1:
			c = new ContaCorrente();
			criarConta((ContaCorrente) c, rs);
			break;
		case 2:
			c = new ContaPoupanca();
			criarConta((ContaPoupanca) c, rs);
			break;
		case 3:
			c = new ContaSalario();
			criarConta((ContaSalario) c, rs);
			break;
		case 4:
			c = new ContaInvestimento();
			criarConta((ContaInvestimento) c, rs);
			break;
		default:
			break;
		}
		return c;
	}

	private void criarConta(ContaInvestimento c, ResultSet rs) throws Exception {
		criarContaPadrao(c, rs);
		// TODO implementar

	}

	private void criarConta(ContaSalario c, ResultSet rs) throws Exception {
		criarContaPadrao(c, rs);
		// TODO implementar

	}

	private void criarConta(ContaPoupanca c, ResultSet rs) throws Exception {
		criarContaPadrao(c, rs);
		// TODO implementar
	}

	private void criarConta(ContaCorrente c, ResultSet rs) throws Exception {
		criarContaPadrao(c, rs);
		c.setTaxaManutencao(rs.getDouble("taxaManutencao"));
		c.setLimiteCredito(rs.getDouble("limiteCredito"));
	}

	private void criarContaPadrao(Conta c, ResultSet rs) throws Exception {
		c.setCodigoConta(rs.getLong("codigoConta"));
		c.setSituacao(SituacaoConta.recuperarSituacaoPorOrdinal(rs
				.getInt("situacao")));
		c.depositar(rs.getDouble("saldo"));
		c.setCliente(new Cliente(rs.getString("nome"), rs.getLong("cpf")));
		c.getCliente().setCodigo(rs.getLong("codigo"));
	}

}
