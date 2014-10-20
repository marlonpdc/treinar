package br.com.treinar.agenda.mb;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;

@ManagedBean
public class ContatoMB {

	private Date date;
	private Contato contato;
	private ContatoDAO contatoDAO;
	private List<TipoTelefone> tipos;
	
	private String texto;
	
	@PostConstruct
	private void init() {
		contatoDAO = new ContatoDAO();
		contato = new Contato();
		contato.setTelefone(new Telefone());
		tipos = Arrays.asList(TipoTelefone.values());
		date = new Date();
	}
	
	public void cadastrarContato() {
		try {
			contatoDAO.adicionar(contato);
			FacesContext.getCurrentInstance().
            addMessage(null, 
               new FacesMessage(FacesMessage.SEVERITY_INFO, 
                                "Contato gravado com sucesso...", null));
		} catch (SQLException e) {
			//TODO tratar
		}
	}
	
	public void teste() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2012);
		date = c.getTime();
	}
	
	public List<Contato> recuperarContatos() {
		List<Contato> contatos = contatoDAO.getLista();
		return contatos != null ? contatos : new ArrayList<Contato>();
	}
	
	public void excluir(Contato contato) {
		contatoDAO.excluirContato(contato);
	}
	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<TipoTelefone> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoTelefone> tipos) {
		this.tipos = tipos;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String navegar() {
		System.out.println("executado antes de navegar");
		texto = "processamento antes de navegar";
		return "pagina2";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
