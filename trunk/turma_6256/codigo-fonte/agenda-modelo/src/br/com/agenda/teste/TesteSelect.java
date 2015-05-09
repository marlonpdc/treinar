package br.com.agenda.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.agenda.modelo.Contato;

public class TesteSelect {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
		EntityManager manager = factory.createEntityManager();

		Contato c = manager.find(Contato.class, 2l);
		
		System.out.println(c.getPessoa().getNome());
		
		Query q = manager.createQuery("select c from Contato c ");
		
		List<Contato> contatos = q.getResultList();
		System.out.println(contatos.size());
		
		System.exit(0);
	}
	
}
