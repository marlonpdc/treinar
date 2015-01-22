package br.com.treinar.tarefa.Caio;

import java.util.Scanner;
public class TratamentoDeErro {


	public static void main(String[] args) {
		Boolean teste = Boolean.FALSE;
		do{
			try{

				System.out.print("Digite um numero: ");
				Scanner teclado = new Scanner(System.in);
				Integer idade = teclado.nextInt();
				teste = Boolean.TRUE;
				teclado.close();
			}catch (java.util.InputMismatchException ex) {
				System.out.println("Digite um numero valido");
			}
		}
		while(teste.equals(Boolean.FALSE));


		/*
		try{
			String nome = null;
			//System.out.println(nome.length());
		}
		catch(NullPointerException ex){
			System.out.println("Erro: " + ex);
		}
		 */

	}
}
