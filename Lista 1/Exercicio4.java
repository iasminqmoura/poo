package lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		String [] nomes = new String [5];
		
		System.out.println("Insira 5 nomes: ");
		
		for(int i = 0; i < nomes.length; i++)
		{
			nome = teclado.nextLine();
			nomes[i] = nome;
		}
		
		System.out.println("Nomes em ordem inversa: ");
		
		for(int i = nomes.length-1; i >=0; i--)
		{
			System.out.println(" " + nomes[i]);
		}

	}

}
