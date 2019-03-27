package lista1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int saldoMedio;
		
		System.out.println("Insira o saldo m�dio para o c�lculo do cr�dito: ");
		saldoMedio = teclado.nextInt();
		
		if(saldoMedio < 0)
		{
			System.out.println("Seu saldo m�dio � negativo, voc� n�o merece nenhum cr�dito.");
			return;
		}
		
		switch((saldoMedio - 1) / 1000) 
		{
			case 0:
				System.out.println("Nenhum cr�dito dispon�vel");
				break;
				
			case 1:
			case 2:
			case 3:
				System.out.println("Cr�dito dispon�vel: " + (saldoMedio * 0.2));	
				
				break;
				
			case 4:
			case 5:
				System.out.println("Cr�dito dispon�vel: " + (saldoMedio * 0.3));
				
				break;
				
			default:
				System.out.println("Cr�dito dispon�vel: " + (saldoMedio * 0.4));
				
				break;
		}
		
	}

}
