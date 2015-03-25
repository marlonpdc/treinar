package br.com.quartetoalegreto.orcamento.controle;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.quartetoalegreto.orcamento.modelo.Telefone;

@FacesConverter("br.com.quarteto.telefoneConverter")
public class TelefoneConverter  implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Telefone t = new Telefone();
		if (!value.isEmpty()) {
			t.setDdd(Integer.parseInt(value.substring(0, 2)));
			t.setNumero(Integer.parseInt(value.substring(2)));			
		}
		return t;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent componet, Object value) {
		Telefone t = (Telefone) value;
		
		return t.getNumero() != null ? t.getDdd().toString() + t.getNumero() : "";
	}

}
