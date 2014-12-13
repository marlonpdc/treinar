package br.com.treinar.agenda.main;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;

public class Agenda {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		Contato contato = new Contato();
		Pessoa pessoa = new Pessoa();
		Telefone t1 = new Telefone();
		Telefone t2 = new Telefone();
		
		t1.setDdd(31);
		t1.setNumero(87749131);
		t1.setTipo(TipoTelefone.CELULAR);
		t2.setDdd(31);
		t2.setNumero(25359131);
		t2.setTipo(TipoTelefone.RESIDENCIAL);
		
		contato.setEmail("ggmoura@gmail"+Calendar.getInstance().get(Calendar.SECOND)+".com");
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
