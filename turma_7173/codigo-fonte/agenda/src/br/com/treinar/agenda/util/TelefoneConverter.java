package br.com.treinar.agenda.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.treinar.agenda.Telefone;

@FacesConverter("br.com.treinar.agenda.controle.TelefoneConverter")
public class TelefoneConverter  implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Telefone t = null;
		if (value != null && !value.isEmpty()) {
			Integer ddd = Integer.parseInt(value.substring(0, 2));
			Integer numero = Integer.parseInt(value.substring(2));
			t = new Telefone();
			t.setDdd(ddd);
			t.setNumero(numero);			
		}
		
		
		return t;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		Telefone t = (Telefone) value;
		
		String ddd = t.getDdd() != null ? String.valueOf(t.getDdd()) : "";
		String numero = t.getNumero() != null ? String.valueOf(t.getNumero()) : "";
		
		return ddd + numero;
		
	}

}
