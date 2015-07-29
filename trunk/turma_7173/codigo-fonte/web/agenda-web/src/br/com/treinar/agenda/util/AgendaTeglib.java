package br.com.treinar.agenda.util;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import br.com.treinar.agenda.TipoTelefone;

public class AgendaTeglib extends SimpleTagSupport  {

	private String id;
	private String name;
	private String tipoSelecionado;

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
		for (TipoTelefone tipo : TipoTelefone.values()) {
			out.print("<option ");
			out.print("value=\"" + tipo.ordinal());
			if (tipoSelecionado != null) {
				out.print(" selected=\"selected\" ");
			}
			out.print("\">");
			out.print(tipo.getDescricao());;
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

	public String getTipoSelecionado() {
		return tipoSelecionado;
	}

	public void setTipoSelecionado(String tipoSelecionado) {
		this.tipoSelecionado = tipoSelecionado;
	}
	
}
