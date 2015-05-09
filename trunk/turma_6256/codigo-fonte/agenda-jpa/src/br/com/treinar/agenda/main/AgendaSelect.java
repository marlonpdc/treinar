package br.com.treinar.agenda.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.modelo.Contato;

public class AgendaSelect {

	public static void main(String[] args) {
		AgendaSelect a = new AgendaSelect();
		Contato c = a.recuperarConftato(1l);
		System.out.println(c);
		
	}
	
/*	private void atualizarContato(Contato c) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();    
		manager.merge(c);
		manager.getTransaction().commit();  		
	}*/

	public Contato recuperarConftato(Long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		return manager.find(Contato.class, id);
	}
	
	
}
