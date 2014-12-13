package br.com.treinar.agenda.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.treinar.agenda.modelo.ContatoVO;

public class AgendaSelectNew {


	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {
		StringBuilder hql = new StringBuilder();
		
		hql.append("select new Contato(c.pessoa.nome, c.email) ");
		hql.append("from Contato c");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager session = factory.createEntityManager();
		Query q = session.createQuery(hql.toString());
		List<ContatoVO> contatos = q.getResultList();
		System.out.println(contatos);
		System.exit(0);
	}
	
}
