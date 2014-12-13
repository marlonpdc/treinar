package br.com.treinar.agenda.modelo;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("br.com.treinar.ValidadorDDD")
public class ValidadorDDD implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent componet, Object obj)
			throws ValidatorException {
		Telefone telefone = (Telefone) obj;
		if (telefone.getDdd() == null || telefone.getDdd() < 1 || telefone.getDdd() > 99) {
			FacesMessage msg = new FacesMessage("Erro DDD.", "Código inválido.");
				msg.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(msg);
	 
		}
	}

}
