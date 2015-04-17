package br.com.treinar.bb;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import br.com.treinar.bb.modelo.StatusConta;

public class BBTaglib extends SimpleTagSupport {

	private String id;
	private String name;


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
		for (StatusConta status : StatusConta.values()) {
			out.print("<option>");
			out.print(status.getDescricao());;
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
	
}
