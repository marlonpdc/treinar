package br.com.treinar.bb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CriarContaComando implements IComando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		String tipoConta = req.getParameter("tipoConta");
		String retorno = null;
		if (tipoConta != null) {
			
//colocado no escopo de aplicação
//			req.setAttribute("status", Arrays.asList(StatusConta.values()));
			
			switch (tipoConta) {
			case "contaCorrente":
				retorno = "/telas/criaContaCorrente.jsp";
				break;
			case "contaPoupanca":
				retorno = "/telas/criaContaPoupanca.jsp";
				break;
			case "contaInvestimento":
				retorno = "/telas/criaContaInvestimento.jsp";
				break;
			default:
				retorno = "telas/criaConta.jsp";
				break;
			}
		} else {
			req.setAttribute("msg", "Selecione o tipo de conta a ser criada.");
			retorno = "/telas/criaConta.jsp";			
		}
		return retorno;
	}

}
