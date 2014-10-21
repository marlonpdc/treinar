package br.com.treinar.agenda.teste;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.ContatoTelefone;
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
		Telefone telefone = new Telefone();
		c.setTelefone(telefone);
		c.getTelefone().setDdd(31);
		c.setTelefone(telefone);
		c.getTelefone().setNumero(87749131);
		c.getTelefone().setTipoTelefone(TipoTelefone.CELULAR);
		c.setTelefones(new ArrayList<ContatoTelefone>());
		ContatoTelefone ct = new ContatoTelefone();
		ct.setContato(c);
		ct.setTelefone(telefone);
		ct.setDataCadastro(new Date());
		ct.setContato(c);
		c.getTelefones().add(ct);
		Telefone t2 = new Telefone();
		t2.setTipoTelefone(TipoTelefone.COMERCIAL);
		t2.setDdd(31);
		t2.setNumero(21231108);
		ContatoTelefone ct2 = new ContatoTelefone();
		ct2.setContato(c);
		ct2.setTelefone(t2);
		ct2.setDataCadastro(new Date());
		c.getTelefones().add(ct2);
		manager.getTransaction().begin();    
		manager.persist(c);
		manager.getTransaction().commit();  

		System.out.println("ID da tarefa: " + c.getId());

		manager.close();
		System.exit(0);
	
	}
	
}
