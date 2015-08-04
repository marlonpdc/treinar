package br.com.treinar.agenda.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.ContatoTelefone;
import br.com.treinar.agenda.Pessoa;
import br.com.treinar.agenda.Telefone;
import br.com.treinar.agenda.TipoTelefone;

public class TesteJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		
		Contato c = new Contato();
		c.setComentario("contato da treinar");
		c.setDataCadastro(new Date());
		c.setPessoa(new Pessoa());
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 15);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.YEAR, 2012);
		c.getPessoa().setDataNascimento(calendar.getTime());
		c.getPessoa().setNome("Maria Sophia");
		c.setTelefones(new ArrayList<ContatoTelefone>());
		Telefone t = new Telefone();
		t.setDdd(31);
		t.setNumero(87749131);
		t.setTipoTelefone(TipoTelefone.CELULAR);
		ContatoTelefone ct = new ContatoTelefone();
		ct.setContato(c);
		ct.setTelefone(t);
		ct.setDataAssociacao(new Date());
		c.getTelefones().add(ct);
		
		manager.getTransaction().begin();    
		manager.persist(c);
		manager.getTransaction().commit();  
		
		manager.close();
		
		System.exit(0);
	}
	
}
