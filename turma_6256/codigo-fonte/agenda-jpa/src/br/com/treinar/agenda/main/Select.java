package br.com.treinar.agenda.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.treinar.agenda.modelo.Contato;

public class Select {

	public static void main(String[] args) {

		
		try {
			Contato contato = recuperarContatoPorId();
			System.out.println(contato);			
		} catch (NoResultException e) {
			System.out.println("nao encontrado");
		}
		System.exit(0);
	}

	private static Contato recuperarContatoPorId() throws NoResultException {

		StringBuilder hql = new StringBuilder();
		hql.append("select c from Contato c where c.id = :id) ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager session = factory.createEntityManager();
		Query q = session.createQuery(hql.toString());
		q.setParameter("id", 99L);
		return (Contato) q.getSingleResult();
		
	}

}
