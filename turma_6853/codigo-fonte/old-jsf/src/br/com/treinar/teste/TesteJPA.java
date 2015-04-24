package br.com.treinar.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.modelo.Telefone;
import br.com.treinar.modelo.TipoTelefone;

public class TesteJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		
		Telefone telefone = new Telefone();
		telefone.setDdd(31);
		telefone.setNumero(555555555);
		telefone.setTipoTelefone(TipoTelefone.RESIDENCIAL);
		
		manager.getTransaction().begin();
		manager.persist(telefone);
		manager.getTransaction().commit();
		
		
		manager.close();
		System.exit(0);
	}
	
}
