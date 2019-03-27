package lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> listaPar = new ArrayList<Integer>();
		ArrayList<Integer> listaImpar = new ArrayList<Integer>();
		
		int num, contPar = 0, contImpar = 0;
		
		System.out.println("Insira números inteiros maiores que zero.(Valor menor que 0 interrompe.)");
		
		do 
		{
			num = Integer.parseInt(teclado.nextLine());
			
			if(num < 0)
			{
				break;
			}
			else
			{
				if(num % 2 == 0)
				{
					listaPar.add(num);
					contPar++;
				}
				
				if(num % 2 != 0)
				{
					listaImpar.add(num);
					contImpar++;
				}
			}
		} while(num > 0);
		
		
		System.out.println("Foram digitados " + contPar + " números pares e " + contImpar + " números ímpares.");
		
		System.out.println("Numeros pares: ");
		for(int i: listaPar)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("\nNumeros ímpares: ");
		for(int i: listaImpar)
		{
			System.out.print(i + " ");
		}
		

	}

}
