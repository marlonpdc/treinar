package br.com.treinar.agenda.controller;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LocaleController {

	private Locale locale;

	public LocaleController() {
		locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	}
	
	public String updateLocale(String language, String country) {
		Locale l = new Locale(language, country);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(l);
		return "/pages/contato/masterpage.xhtml";
	}
	
    public Locale getLocale() {
        return locale;
    }

    public String getLanguage() {
        return locale.getLanguage();
    }

    public void setLanguage(String language) {
        locale = new Locale(language);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
}
