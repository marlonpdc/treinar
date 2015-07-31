package br.com.treinar.agenda.controle;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.treinar.agenda.TipoTelefone;

@ManagedBean
@ApplicationScoped
public class AgendaMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<TipoTelefone> tiposTelefone;
	
	private Map<String, Locale> countries;

	@PostConstruct
	private void init() {
		tiposTelefone = Arrays.asList(TipoTelefone.values());
		countries = new LinkedHashMap<String, Locale>();
		countries.put("English", Locale.ENGLISH);
		countries.put("French", Locale.FRENCH);
		countries.put("Portugues", new Locale("pt", "BR"));
	}
	
	public List<TipoTelefone> getTiposTelefone() {
		return tiposTelefone;
	}

	public void setTiposTelefone(List<TipoTelefone> tiposTelefone) {
		this.tiposTelefone = tiposTelefone;
	}

	public Map<String, Locale> getCountries() {
		return countries;
	}

	public void setCountries(Map<String, Locale> countries) {
		this.countries = countries;
	}
	
}
