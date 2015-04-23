package br.com.treinar;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.treinar.modelo.Telefone;


@FacesConverter("br.com.treinar.TelefoneConverter")
public class TelefoneConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String arg) {
		
		Telefone t = null;
		if (arg != null && !arg.equals("")) {
			t = new Telefone();
			t.setDdd(Integer.parseInt(arg.substring(1, 3)));
			t.setNumero(Integer.parseInt(arg.substring(5).replace("-", "")));			
		}
		
		return t;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object obj) {
		Telefone t = (Telefone) obj;
		if (t.getDdd() != null && t.getNumero() != null) {
			return "(" + t.getDdd() + ") " + t.getNumero().toString().substring(0, 3) + "-" + t.getNumero().toString().substring(4);			
		}
		return "";
	}

}
