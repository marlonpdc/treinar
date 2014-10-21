package br.com.treinar.agenda.teste;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;

public class TesteJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda");
		EntityManager manager = factory.createEntityManager();
		Contato c = new Contato();
		c.setNome("Erica Gomes");
		c.setEmail("erica@gmail.com");
		c.setEndereco("rua da primavera, 240 vila da serra");
		c.setDataNascimento(new Date());
		c.setTelefone(new Telefone());
		c.getTelefone().setDdd(31);
		c.getTelefone().setNumero(87749131);
		c.getTelefone().setTipoTelefone(TipoTelefone.CELULAR);
		c.setTelefones(new ArrayList<Telefone>());
		c.getTelefones().add(c.getTelefone());
		manager.getTransaction().begin();    
		manager.persist(c);
		manager.getTransaction().commit();  

		System.out.println("ID da tarefa: " + c.getId());

		manager.close();
		
	
	}
	
}
