package br.com.treinar.itau.util;

public interface ItauConstante {

	interface DatabaseMetainfo {
		String URL_CONEXAO = "jdbc:mysql://localhost/bb";
		String USUARIO = "root";
		String SENHA = "";
	}
	
	Integer HORA_ABERTURA = 10;
	Integer HORA_FECHINTEGER = 16;
	
	Integer ESTRATEGIA_PERSISTENCIA = 1;
	
}
