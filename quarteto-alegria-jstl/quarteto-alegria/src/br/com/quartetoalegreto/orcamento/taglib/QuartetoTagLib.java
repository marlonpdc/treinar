package br.com.quartetoalegreto.orcamento.taglib;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import br.com.quartetoalegreto.orcamento.modelo.TipoEvento;

public class QuartetoTagLib extends SimpleTagSupport {

	private String id;
	
	private String name;

	StringWriter sw = new StringWriter();

	public void doTag() throws JspException, IOException {
		if (id != null && name != null) {
			/* Use message from attribute */
			JspWriter out = getJspContext().getOut();
			TipoEvento[] tipoEvento = TipoEvento.values();
			out.println("<label for=\"" + id + "\">Tipo do Evento:&#160;</label>");
			out.println("<select id =\""+ id + "\" name=\"" + name + "\">");
			out.print("<option value=\"-1\">Selecione</option>");
			for (TipoEvento tipo : tipoEvento) {
				out.println("<option value=\"");
				out.print(tipo);
				out.print("\"");
				out.print(">");
				out.print(tipo.getDescricao());
				out.print("</option>");
			}
			out.println("</select>");

		} else {
			/* use message from the body */
			getJspBody().invoke(sw);
			getJspContext().getOut().println(sw.toString());
		}
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
	
	
}
