package lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		int idade;
		
		String [] nomes = new String [3];
		int [] idades = new int [3];
		
		
		for(int i = 0; i < nomes.length; i++)
		{
			System.out.println("Insira o nome: ");
			nome = teclado.nextLine();
			nomes[i] = nome;

			System.out.println("Insira a idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			idades[i] = idade;
		}
		
		int idadeMaior = 0;
		int idadeMenor = 99999;
		int idMaior = -1;
		int idMenor = -1;
		
		for(int i = 0; i < nomes.length; i++)
		{
			if(idades[i] > idadeMaior)
			{
				idadeMaior = idades[i];
				idMaior = i;
			}
			
			if(idades[i] < idadeMenor)
			{
				idadeMenor = idades[i];
				idMenor = i;
			}
		}
		
		System.out.println("O nome da pessoa mais velha é " + nomes[idMaior] + " e o nome da pessoa mais nova é " + nomes[idMenor]);

	}

}
