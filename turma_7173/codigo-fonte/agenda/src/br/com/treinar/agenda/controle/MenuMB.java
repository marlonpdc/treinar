package br.com.treinar.agenda.controle;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
public class MenuMB implements Serializable {

	public String navegar(String pagina) {
		return pagina;
	}

	private static final long serialVersionUID = 1L;
	private String locale;

	@ManagedProperty(value = "#{agendaMB}")
	private AgendaMB agendaMB;

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	// value change event listener
	public void localeChanged(ValueChangeEvent e) {
		String newLocaleValue = e.getNewValue().toString();
		for (Map.Entry<String, Locale> entry : agendaMB.getCountries()
				.entrySet()) {
			if (entry.getValue().toString().equals(newLocaleValue)) {
				FacesContext.getCurrentInstance().getViewRoot()
						.setLocale((Locale) entry.getValue());
			}
		}
	}

	public AgendaMB getAgendaMB() {
		return agendaMB;
	}

	public void setAgendaMB(AgendaMB agendaMB) {
		this.agendaMB = agendaMB;
	}

}
