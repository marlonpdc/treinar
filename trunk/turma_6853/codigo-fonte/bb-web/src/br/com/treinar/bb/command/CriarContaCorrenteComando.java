package br.com.treinar.bb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.StatusConta;
import br.com.treinar.bb.modelo.exception.BBException;
import br.com.treinar.bb.modelo.exception.SemDisponibilidadeException;
import br.com.treinar.bb.modelo.exception.ValorInvalidoException;
import br.com.treinar.bb.util.BBUtil;

public class CriarContaCorrenteComando implements IComando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws BBException {
	
		try {
			validarCampos(req);
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
			cc.setLimiteCredito(Double.valueOf(limiteCredito.replace(",", ".")));
			cc.setTaxaManutencao(Double.valueOf(taxaManutencao.replace(",", ".")));
			
			BBUtil.getInstance().adicionarConta(cc);
			
			req.setAttribute("msg", "Conta Cadastrada com sucesso!.");
			
			return "/telas/principal.jsp";
		} catch (ValorInvalidoException e) {
			BBException exception = new BBException();
			exception.setMensagem("Valor Invalido");
			exception.setLocalRetorno("/telas/criaContaCorrente.jsp");
			throw exception;
			
		} catch (SemDisponibilidadeException e) {
			BBException exception = new BBException();
			exception.setMensagem("Sem Disponibilidade");
			exception.setLocalRetorno("/telas/criaContaCorrente.jsp");
			throw exception;
		} catch (BBException e) {
			recolocarCampos(req);
			throw e;
		}
		
		
	}

	private void recolocarCampos(HttpServletRequest req) {
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String saldo = req.getParameter("saldo");
		String status = req.getParameter("status");
		String limiteCredito = req.getParameter("limiteCredito");
		String taxaManutencao = req.getParameter("taxaManutencao");
		
		req.setAttribute("nome", nome);
		req.setAttribute("cpf", cpf);
		req.setAttribute("saldo", saldo);
		req.setAttribute("status", status);
		req.setAttribute("limiteCredito", limiteCredito);
		req.setAttribute("taxaManutencao", taxaManutencao);

	}

	private void validarCampos(HttpServletRequest req) throws BBException {
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String saldo = req.getParameter("saldo");
		String status = req.getParameter("status");
		String limiteCredito = req.getParameter("limiteCredito");
		String taxaManutencao = req.getParameter("taxaManutencao");
		StringBuilder erro = new StringBuilder();
		Boolean temErro = Boolean.FALSE;
		if (nome == null || nome.isEmpty()) {
			erro.append("Nome, ");
			temErro = Boolean.TRUE;
		}
		if (cpf == null || cpf.isEmpty()) {
			erro.append(" CPF,");
			temErro = Boolean.TRUE;
		}
		if (saldo == null || saldo.isEmpty()) {
			erro.append(" Nome,");
			temErro = Boolean.TRUE;
		}
		if (status == null || status.isEmpty()) {
			erro.append(" Status,");
			temErro = Boolean.TRUE;
		}
		if (limiteCredito == null || limiteCredito.isEmpty()) {
			erro.append(" Limite de Crédito,");			
			temErro = Boolean.TRUE;
		}
		if (taxaManutencao == null || taxaManutencao.isEmpty()) {
			erro.append(" Taxa de Manutenção,");						
			temErro = Boolean.TRUE;
		}
		if (temErro) {
			BBException bbException = new BBException();
			bbException.setMensagem(erro.toString());
			bbException.setLocalRetorno("/telas/criaContaCorrente.jsp");
			throw bbException;
		}
	}

}
