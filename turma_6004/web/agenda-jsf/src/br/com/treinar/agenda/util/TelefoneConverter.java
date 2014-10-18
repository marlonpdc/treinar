package br.com.treinar.agenda.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.treinar.agenda.modelo.Telefone;

@FacesConverter("br.com.treinar.agenda.TelefoneConverter")
public class TelefoneConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String obj) {
		Telefone telefone = new Telefone();
		Integer ddd = Integer.parseInt(obj.substring(1, 3));
		Integer numero = Integer.parseInt(obj.substring(4, 12));
		telefone.setDdd(ddd);
		telefone.setNumero(numero);
		return telefone;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object obj) {
		Telefone t = (Telefone) obj;
		return "(" + (t.getDdd() != null ? t.getDdd() : "") + ")" + (t.getNumero() != null ? t.getNumero() : "");
	}

}
