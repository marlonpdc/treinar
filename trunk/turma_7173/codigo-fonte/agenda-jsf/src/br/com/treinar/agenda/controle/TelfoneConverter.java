package br.com.treinar.agenda.controle;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.treinar.agenda.Telefone;

@FacesConverter("br.com.treinar.agenda.controle.TelfoneConverter")
public class TelfoneConverter  implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Integer ddd = Integer.parseInt(value.substring(0, 2));
		Integer numero = Integer.parseInt(value.substring(2));
		Telefone t = new Telefone();
		t.setDdd(ddd);
		t.setNumero(numero);
		
		return t;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		Telefone t = (Telefone) value;
		
		return t.getDdd() != null ? String.valueOf(t.getDdd()) : "" + (t.getNumero() != null ? String.valueOf(t.getNumero()) : "");
		
	}

}
