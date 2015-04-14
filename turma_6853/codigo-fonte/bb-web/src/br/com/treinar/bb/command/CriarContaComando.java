package br.com.treinar.bb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CriarContaComando implements IComando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		String tipoConta = req.getParameter("tipoConta");
		String retorno = null;
		switch (tipoConta) {
			case "contaCorrente":
				retorno = "criaContaCorrente.jsp";
				break;
			case "contaPoupanca":
				retorno = "criaContaPoupanca.jsp";
				break;
			case "contaInvestimento":
				retorno = "criaContaInvestimento.jsp";
				break;
			default:
				retorno = "criaConta.jsp";
				break;
			}
		return retorno;
	}

}
