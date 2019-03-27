package lista1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Vector<String> pessoas = new Vector<String>();

		String nome;
		int idade;
		float peso;
		
		
		
		while(true) 
		{
			System.out.println("Insira o nome: ");
			nome = teclado.nextLine();
			
			if(nome.equals("fim"))
			{
				break;
			}
			
			else
			{

				System.out.println("Insira a idade: ");
				idade = Integer.parseInt(teclado.nextLine());
				
				System.out.println("Insira o peso: ");
				peso = Float.parseFloat(teclado.nextLine());
				
				pessoas.add("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Peso: " + peso);
			}
			
		}
		
		for(String pessoa: pessoas)
		{
			System.out.println("\n" + pessoa);
		}
	}

}
