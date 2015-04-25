package br.com.treinar.agenda.util;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import br.com.agenda.modelo.TipoTelefone;

public class TipoTelefoneTLD  extends SimpleTagSupport {

	private String id;
	private String name;
	private String selecionado;
	
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("<select");
		if (id != null) {
			out.print(" id='");
			out.print(id);
			out.print("'");
		}
		if (name != null) {
			out.print(" name='");
			out.print(name);
			out.print("'");
		}
		out.println(">");
		out.print("<option value=\"-1\">Selecione</option>");
		for (TipoTelefone tipo : TipoTelefone.values()) {
			out.print("<option value=\"");
			out.print(tipo);
			if (selecionado != null && selecionado.equals(tipo.getDescricao())) {
				out.print("\" selected>");
			} else {
				out.print("\">");				
			}
			out.print(tipo.getDescricao());
			out.print("</option>");				
		}
		out.println("</select>");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSelecionado() {
		return selecionado;
	}

	public void setSelecionado(String selecionado) {
		this.selecionado = selecionado;
	}
	
}
