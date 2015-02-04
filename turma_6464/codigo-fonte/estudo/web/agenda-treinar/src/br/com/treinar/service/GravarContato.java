package br.com.treinar.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.modelo.Contato;
import br.com.treinar.modelo.Telefone;
import br.com.treinar.modelo.TipoTelefone;
import br.com.treinar.util.AgendaException;
import br.com.treinar.util.TreinarUtil;

public class GravarContato implements Comando {

	@Override
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws AgendaException {
		// TODO implementar regras para gravar contato
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String tipoTelefone = request.getParameter("tipoTelefone");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setTelefone(new Telefone());
		contato.getTelefone().setTipoTelefone(TipoTelefone.valueOf(tipoTelefone.trim()));
		contato.getTelefone().setCodPais(Integer.parseInt(telefone.substring(0, 2)));
		contato.getTelefone().setCodCidade(Integer.parseInt(telefone.substring(2, 4)));
		contato.getTelefone().setCodPais(Integer.parseInt(telefone.substring(4, 12)));
		
		validarContatoRepetido(contato);
		
		TreinarUtil.getInstance().getContatos().add(contato);
		
		return "/pages/lista/listaContatos.jsp";
		
		
		
	}

	private void validarContatoRepetido(Contato contato) throws AgendaException {
		if (TreinarUtil.getInstance().getContatos().contains(contato)) {
			throw new AgendaException("Contato já cadastrado");
		}
	}

}
