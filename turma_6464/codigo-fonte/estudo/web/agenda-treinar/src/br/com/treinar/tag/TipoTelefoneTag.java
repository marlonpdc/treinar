package br.com.treinar.tag;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

import br.com.treinar.modelo.TipoTelefone;

public class TipoTelefoneTag extends SimpleTagSupport {


	private String id;
	
	private String name;
	
	public void doTag() throws JspException, IOException {
		
		TipoTelefone[] tipos = TipoTelefone.valuesOrderByDescription();
		StringBuilder html = new StringBuilder();
		html.append("<select name=\"").append(name);
		html.append("\" id=\"").append(id).append("\">");
		html.append("<option value=\"\">Selecione</option>");
		
		//ordenar
		for (TipoTelefone tipoTelefone : tipos) {
			html.append("<option value=\"");
			html.append(tipoTelefone);
			html.append("\">").append(tipoTelefone.getDescricao());
			html.append("</option>");
		}
		html.append("</select>");
		
		getJspContext().getOut().println(html.toString());
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
