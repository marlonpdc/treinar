package br.com.treinar.agenda.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.modelo.Contato;

public class TesteUpdate {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
		EntityManager manager = factory.createEntityManager();
		Contato c = manager.find(Contato.class, 3L);
		c.setNome("Gleidson Moura");
		
		c.setEmail("gleidson@gmail.com");
		
		manager.getTransaction().begin();
		manager.merge(c);
		manager.getTransaction().commit();
		
		manager.close();
		System.exit(0);
	}
	
}
