package br.com.treinar.itau.util;

import br.com.treinar.itau.controle.ItauControleArray;
import br.com.treinar.itau.controle.ItauControleCollection;
import br.com.treinar.itau.controle.ItauControleJDBC;

public interface ItauConstante {

	interface DatabaseMetainfo {
		String URL_CONEXAO = "jdbc:mysql://localhost:3306/bb";
		String USUARIO = "root";
		String SENHA = "";
	}
	
	Integer HORA_ABERTURA = 10;
	Integer HORA_FECHINTEGER = 16;
	
	Class<?> ESTRATEGIA_PERSISTENCIA_ARRAY = ItauControleArray.class;
	Class<?> ESTRATEGIA_PERSISTENCIA_COLLECTION = ItauControleCollection.class;
	Class<?> ESTRATEGIA_PERSISTENCIA_JDBC = ItauControleJDBC.class;
}
