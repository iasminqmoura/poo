package iftm.poo.exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double peso = 0;
		int opcao = 0;
		
		System.out.println();
		System.out.println("Peso no planeta");
		System.out.println("1 - Merc�rio");
		System.out.println("2 - V�nus");
		System.out.println("3 - Marte");
		System.out.println("4 - J�pter");
		System.out.println("5 - Saturno");
		System.out.println("6 - Urano");
		System.out.println("7 - Netuno");
		
		System.out.println("Escolha uma op��o: ");
		opcao = teclado.nextInt();
		
		switch(opcao)
		{
		case 1:
			System.out.println("Insira o peso na Terra: ");
			peso = teclado.nextDouble();
		break;
		
		case 2:
			System.out.println("Insira o peso na Terra: ");
			peso = teclado.nextDouble();
		break;
		
		case 3:
			System.out.println("Insira o peso na Terra: ");
			peso = teclado.nextDouble();
		break;
		
		case 4:
			System.out.println("Insira o peso na Terra: ");
			peso = teclado.nextDouble();
		break;
		
		case 5:
			System.out.println("Insira o peso na Terra: ");
			peso = teclado.nextDouble();
		break;
		
		case 6:
			System.out.println("Insira o peso na Terra: ");
			peso = teclado.nextDouble();
		break;
		
		case 7:
			System.out.println("Insira o peso na Terra: ");
			peso = teclado.nextDouble();
		break;
		
		}
		
		PesoNoPlaneta np = new PesoNoPlaneta(peso, opcao);
		try {
			System.out.println("Peso no planeta selecionado: " + np.calculaPeso());
		} catch (Exception e) {
			System.out.println("Op��o inv�lida.");
		}
		
		
		teclado.close();
	}

}
