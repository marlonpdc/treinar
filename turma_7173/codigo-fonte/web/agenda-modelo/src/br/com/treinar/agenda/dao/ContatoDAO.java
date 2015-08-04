package br.com.treinar.agenda.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Hibernate;

import br.com.treinar.agenda.Contato;

public class ContatoDAO extends GenericDAO<Contato> {

	@Override
	public Contato recuperar(Long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		Contato contato = manager.find(Contato.class, id);
		manager.close();
		return contato;
	}
	
	public Contato recuperarPorNome(String nome) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		Query q = manager.createNamedQuery("contatosPorNome");
		q.setParameter("nome", nome);
		Contato c = (Contato) q.getSingleResult();
		Hibernate.initialize(c.getPessoa());
		manager.close();
		return c;
	}

	@Override
	public List<Contato> recuperarTodos() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		Query q = manager.createNamedQuery("contatos");
		@SuppressWarnings("unchecked")
		List<Contato> contatos = q.getResultList();
		return contatos;
	}

	@Override
	public void remover(Contato c) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		c = manager.find(Contato.class, c.getId());
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
		manager.close();
	}

}
