package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float horas;
		float salario = 0;
		
		System.out.println("Insira a quantidade de horas trabalhadas durante o m�s: ");
		horas = teclado.nextFloat();
		
		if(horas > 730)
		{
			System.out.println("Um m�s tem aproximadamente 730 horas, insira uma quantidade menor.");
		}
		else
		{
			salario = horas * 10.25f;
			System.out.println("O sal�rio mensal de acordo com as horas inseridas � de: " + salario);
		}
		
	}

}
