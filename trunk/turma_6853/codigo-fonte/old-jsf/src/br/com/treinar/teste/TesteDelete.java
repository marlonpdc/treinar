package br.com.treinar.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.modelo.Telefone;

public class TesteDelete {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Telefone t = manager.find(Telefone.class, 2l);
		
		manager.remove(t);
		
		manager.getTransaction().commit();
		manager.close();
		
		System.exit(0);
		
		
	}
	
}
