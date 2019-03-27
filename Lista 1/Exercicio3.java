package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float horas;
		float salario = 0;
		
		System.out.println("Insira a quantidade de horas trabalhadas durante o mês: ");
		horas = teclado.nextFloat();
		
		if(horas > 730)
		{
			System.out.println("Um mês tem aproximadamente 730 horas, insira uma quantidade menor.");
		}
		else
		{
			salario = horas * 10.25f;
			System.out.println("O salário mensal de acordo com as horas inseridas é de: " + salario);
		}
		
	}

}
