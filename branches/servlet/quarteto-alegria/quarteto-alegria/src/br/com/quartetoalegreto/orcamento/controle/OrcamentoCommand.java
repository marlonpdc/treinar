package br.com.quartetoalegreto.orcamento.controle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.quartetoalegreto.orcamento.Util;
import br.com.quartetoalegreto.orcamento.modelo.Cliente;
import br.com.quartetoalegreto.orcamento.modelo.Evento;
import br.com.quartetoalegreto.orcamento.modelo.Orcamento;
import br.com.quartetoalegreto.orcamento.modelo.StatusOrcamento;

public class OrcamentoCommand implements Command {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws QuartetoAlegriaException {
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm");
			
			String nomeCliente = request.getParameter("nomeCliente");
			String emailCliente = request.getParameter("email");
			String enderecoEvento = request.getParameter("enderecoEvento");
			String inicioEvento = request.getParameter("inicioEvento");
			String terminoEvento = request.getParameter("terminoEvento");
			Cliente c = new Cliente();
			c.setNome(nomeCliente);
			c.setEmail(emailCliente);

			Evento e = new Evento();
			e.setEndereco(enderecoEvento);
			e.setDataInicio(df.parse(inicioEvento));
			e.setDataTermino(df.parse(terminoEvento));
			e.setEndereco(enderecoEvento);
			Orcamento o = new Orcamento();
			o.setStatus(StatusOrcamento.REGISTRADO);
			o.setEvento(e);
			o.setCliente(c);
			o.setValor(100d);
			
			Util.orcamentos.add(o);
			
			return "pages/acompanhamento-orcamento.jsp";
		} catch (Exception e) {
			return "pages/acompanhamento-orcamento.jsp";			
		}
	}

}
