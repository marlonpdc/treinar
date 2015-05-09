package br.com.agenda.teste;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.agenda.modelo.Contato;
import br.com.agenda.modelo.Pessoa;
import br.com.agenda.modelo.Telefone;
import br.com.agenda.modelo.TipoTelefone;

public class TesteJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
		EntityManager manager = factory.createEntityManager();
		
		Contato c = new Contato();
		c.setPessoa(new Pessoa());
		c.getPessoa().setNome("Maria Sophia");
		c.getPessoa().setDataNascimento(new Date());
		c.setEmail("sophia@gmail.com");
		c.setTelefone(new Telefone());
		c.getTelefone().setDdd(31);
		c.getTelefone().setNumero(87749131);
		c.getTelefone().setTipo(TipoTelefone.CELULAR);
		
		manager.getTransaction().begin();    
		manager.persist(c);
		manager.getTransaction().commit();
		
		manager.close();
		System.exit(0);
	}
	
}
