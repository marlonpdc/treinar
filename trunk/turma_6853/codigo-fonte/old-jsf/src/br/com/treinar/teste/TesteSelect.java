package br.com.treinar.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinar.modelo.Telefone;
import br.com.treinar.modelo.TipoTelefone;

public class TesteSelect {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Telefone t = manager.find(Telefone.class, 2l);
		
		System.out.println(t);
		
		
		t.setTipoTelefone(TipoTelefone.RESIDENCIAL);
		t.setNumero(2222222);
		
		manager.merge(t);
		
		manager.getTransaction().commit();
		manager.close();
		
		System.exit(0);
		
		
	}
	
}
