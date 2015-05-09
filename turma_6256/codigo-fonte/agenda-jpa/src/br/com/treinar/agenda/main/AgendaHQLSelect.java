package br.com.treinar.agenda.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.Constant;

public class AgendaHQLSelect {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		Query q = manager.createNamedQuery(Constant.NamadQueris.FIND_CONTATO_BY_NOME);
		q.setParameter("nome", "G%");
		List<Contato> contatos = q.getResultList();
		
		System.out.println(contatos.size());
		
		
	}
	
}
