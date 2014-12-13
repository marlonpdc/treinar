package br.com.treinar.agenda.modelo;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class AppController {

	public void editLocale(String linguagem, String pais) {
		Locale locale = new Locale(linguagem, pais);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
	}
	
	
	
	
}
