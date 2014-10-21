package br.com.treinar.agenda.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.ContatoTelefone;

public class TesteSelect {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
		EntityManager manager = factory.createEntityManager();
		Contato c = manager.find(Contato.class, 1L);
		
		System.out.println(c);
		for (ContatoTelefone ct : c.getTelefones()) {
			System.out.println(ct.getTelefone());
		}
		
		manager.close();
		System.exit(0);
	}
	
}
