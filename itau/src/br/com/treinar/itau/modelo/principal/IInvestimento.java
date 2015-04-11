package br.com.treinar.itau.modelo.principal;

import java.util.Date;

public interface IInvestimento extends ITributavel, ICaptalizavel {

	Integer qdtMesesInvestimento = 12;
	
	Date getDataInicioInvestimento();
	
}
