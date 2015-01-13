package br.com.charles.modelo;

import java.sql.Date;

public class CartaoInternacional extends CartaoDeCredito {
	
	Integer numero;
	Date dataVencimento;
	
	@Override
	public Double comprar(Double valorCompra) {
		return null;
	}

}
