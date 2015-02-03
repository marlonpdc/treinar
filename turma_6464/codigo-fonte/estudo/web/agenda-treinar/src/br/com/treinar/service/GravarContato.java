package br.com.treinar.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.modelo.Contato;
import br.com.treinar.modelo.Telefone;
import br.com.treinar.modelo.TipoTelefone;
import br.com.treinar.util.TreinarUtil;

public class GravarContato implements Comando {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) {
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
		
		TreinarUtil.getInstance().getContatos().add(contato);
		
		RequestDispatcher rd = request.getRequestDispatcher("/pages/lista/listaContatos.jsp");  
		try {
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
