package br.com.treinar.bb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.StatusConta;
import br.com.treinar.bb.util.BBUtil;

public class CriarContaCorrenteComando implements IComando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String saldo = req.getParameter("saldo");
		String status = req.getParameter("status");
		String limiteCredito = req.getParameter("limiteCredito");
		String taxaManutencao = req.getParameter("taxaManutencao");
		
		ContaCorrente cc = new ContaCorrente();
		cc.setCliente(new Cliente());
		cc.getCliente().setNome(nome);
		cc.getCliente().setCpf(Long.parseLong(cpf));
		cc.depositar(Double.valueOf(saldo));
		cc.setStatusConta(StatusConta.valueOf(status));
		cc.setLimiteCredito(Double.valueOf(limiteCredito));
		cc.setTaxaManutencao(Double.valueOf(taxaManutencao));
		
		BBUtil.getInstance().adicionarConta(cc);
		
		req.setAttribute("msg", "Conta Cadastrada com sucesso!.");
		
		return "/telas/criaConta.jsp";
	}

}
