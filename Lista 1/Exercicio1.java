package lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float altura, baseMenor, baseMaior;
		float area = 0;
		
		System.out.println("Informe a altura: ");
		altura = teclado.nextFloat();
		
		System.out.println("Informe a base menor: ");
		baseMenor = teclado.nextFloat();
		
		System.out.println("Informe a base maior: ");
		baseMaior = teclado.nextFloat();
		
		if(baseMaior >= baseMenor)
		{
			area = (altura * (baseMenor + baseMaior)) / 2;
			System.out.println("Área: " + area);
		}
		else
		{
			System.out.println("O valor inserido para a base menor é maior que o valor inserido para a base maior.\nInsira novamente.");
		}
		
		
	}

}
