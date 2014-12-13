package br.com.treinar.agenda.modelo;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("br.com.treinar.ConverterTelefone")
public class ConverterTelefone implements Converter {

	@Override
	public Object getAsObject(FacesContext contex, UIComponent component, String obj) {
		Telefone t = null;
		if (obj.length() == 12) {
			t = new Telefone();
			t.setDdd(Integer.parseInt(obj.substring(1, 3)));
			t.setNumero(Integer.parseInt(obj.substring(4, 12)));			
		}
		return t;
	}

	@Override
	public String getAsString(FacesContext contex, UIComponent component, Object obj) {
		Telefone t = (Telefone) obj;
		return t.toString();
	}

}
