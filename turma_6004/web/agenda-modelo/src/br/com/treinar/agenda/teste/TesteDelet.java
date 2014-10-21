package br.com.treinar.agenda.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.modelo.Contato;

public class TesteDelet {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
		EntityManager manager = factory.createEntityManager();
		Contato c = manager.find(Contato.class, 2L);
		
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
		
		manager.close();
		System.exit(0);
	}
	
}
