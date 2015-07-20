package br.com.treinar.jdbc.dao;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import br.com.treinar.jdbc.modelo.Contato;


public class CadastraContato {
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Contato contato = new Contato();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe o Nome    : ");
		contato.setNome(sc.nextLine());
		System.out.print("Informe o Email   : ");		
		contato.setEmail(sc.nextLine());
		System.out.print("Informe o Endereço: ");		
		contato.setEndereco(sc.nextLine());
		System.out.print("Informe a Data de nascimento: ");		
		contato.setDataNascimento(df.parse(sc.nextLine()));
		
		ContatoDAO dao = new ContatoDAO();
		dao.adicionar(contato);
		
		System.out.println("Registro gravado com sucesso.");
		
		
		sc.close();
		
	}

}
