package br.com.treinar.jdbc.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import br.com.treinar.jdbc.modelo.Contato;

public class TesteContatoDAO {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Contato contato = new Contato();
		ContatoDAO dao = new ContatoDAO();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe a data: ");
		contato.setDataNascimento(df.parse(sc.nextLine()));
		System.out.print("Informe o nome: ");
		contato.setNome(sc.nextLine());
		System.out.print("Informe o email: ");
		contato.setEmail(sc.nextLine());
		System.out.print("Informe o endereço: ");
		contato.setEndereco(sc.nextLine());
	
		dao.adicionar(contato);
		sc.close();
	}
	
}
