package br.com.quartetoalegreto.orcamento.controle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.quartetoalegreto.orcamento.Util;

public class GerenciaOrcamentoCommand implements ICommand {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws QuartetoAlegriaException {
		request.setAttribute("orcamentos", Util.orcamentos);
		//request.setAttribute("statusOrcamento", StatusOrcamento.values());
		
		return "pages/acompanhamento-orcamento.jsp";
	}

}
