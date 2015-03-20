package br.com.quartetoalegreto.orcamento.controle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.quartetoalegreto.orcamento.Util;

public class GerenciaOrcamentoCommand implements Command {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws QuartetoAlegriaException {
		request.setAttribute("orcamentos", Util.orcamentos);
		return "pages/cadastro-orcamento.jsp";
	}

}
