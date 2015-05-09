package br.com.treinar.agenda.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Pessoa;

public class AgendaUpdate {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		Contato contato = new Contato();
		Pessoa pessoa = new Pessoa();
		
		contato.setEmail("ggmoura@gmail2.com");
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Gleidosn Guimarães Moura");
		contato.setPessoa(pessoa);
		manager.getTransaction().begin();    
		manager.persist(contato);
		manager.getTransaction().commit();  
		
		manager.close();
		System.exit(0);
	}
	
}
