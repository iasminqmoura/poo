package lista1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		float custoFabrica, custoConsumidor;
		
		System.out.println("Insira o custo de fábrica do veículo: ");
		custoFabrica = teclado.nextFloat();
		
		custoConsumidor = custoFabrica + ((custoFabrica * 0.28f) + (custoFabrica * 0.45f));
		
		System.out.println("O custo ao consumidor pelo veículo é de: " + custoConsumidor);
	}

}
