package br.com.treinar.agenda.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Hibernate;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.ContatoTelefone;

public class TesteSelect {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agenda-jpa");
		EntityManager manager = factory.createEntityManager();
		
		Contato c = manager.find(Contato.class, 3L);
		
		System.out.println("Nome:\t\t\t" + c.getPessoa().getNome());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data Nascimento:\t\t\t" + sdf.format(c.getPessoa().getDataNascimento()));
		System.out.println(sdf.format(c.getDataCadastro()));
		System.out.println("Data Cadastro:\t\t\t" + c.getComentario());
		
		List<ContatoTelefone> telefones = c.getTelefones();
		//Hibernate.initialize(telefones);
		for (ContatoTelefone cts : telefones) {
			System.out.println(cts.getTelefone());
		}
		manager.close();
		System.exit(0);
	}
	
}
