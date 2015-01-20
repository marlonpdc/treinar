package br.com.treinar.bradesco;

import br.com.treinar.bradesco.banco.ICaptalizavel;
import br.com.treinar.bradesco.banco.ITarifavel;

public class PrevidenciaPrivada implements ICaptalizavel, ITarifavel {

	private Double premio;
	
	@Override
	public void captalizar() {
		
	}
	
	@Override
	public void tarifar() {
		
	}

	public Double getPremio() {
		return premio;
	}

	public void setPremio(Double premio) {
		this.premio = premio;
	}
	
	
	
}
