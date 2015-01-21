package br.com.treinar.bradesco;

import java.util.Date;

import br.com.treinar.bradesco.banco.ICaptalizavel;
import br.com.treinar.bradesco.banco.ITarifavel;

public class PrevidenciaPrivada implements ICaptalizavel, ITarifavel {

	private Double premio;
	private Titular titular;
	private Long codigo;
	private Date dataAquisicao;
	
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

	@Override
	public Titular getTitular() {
		return titular;
	}

	@Override
	public Date getDataAquisicao() {
		return dataAquisicao;
	}

	@Override
	public Long getCodigo() {
		return codigo;
	}
	
	
	
}
