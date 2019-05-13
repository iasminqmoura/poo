package iftm.poo.simulado2.Exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		
		OperacaoMatematica operacao;
				
		do {
			System.out.println();
			System.out.println("Opera��es matem�ticas");
			System.out.println();
			System.out.println("1 - Soma");
			System.out.println("2 - Subtracao");
			System.out.println("3 - Multiplicacao");
			System.out.println("4 - Divisao");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha uma op��o: ");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Insira o primeiro n�mero: ");
				int a = teclado.nextInt();
				
				System.out.print("Insira o segundo n�mero: ");
				int b = teclado.nextInt();
				
				operacao = new Soma();
				System.out.println("Soma: " + operacao.calcula(a, b));
				
				break;
				
			case 2:
				System.out.print("Insira o primeiro n�mero: ");
				a = teclado.nextInt();
				
				System.out.print("Insira o segundo n�mero: ");
				b = teclado.nextInt();

				operacao = new Subtracao();
				System.out.println("Subtra��o: " + operacao.calcula(a, b));
				
				break;
				
			case 3:
				System.out.print("Insira o primeiro n�mero: ");
				a = teclado.nextInt();
				
				System.out.print("Insira o segundo n�mero: ");
				b = teclado.nextInt();

				operacao = new Multiplicacao();
				System.out.println("Multiplica��o: " + operacao.calcula(a, b));
				
				break;
				
			case 4:
				System.out.print("Insira o primeiro n�mero: ");
				a = teclado.nextInt();
				
				System.out.print("Insira o segundo n�mero: ");
				b = teclado.nextInt();

				operacao = new Divisao();
				System.out.println("Divis�o: " + operacao.calcula(a, b));
				break;
				
			case 0:
				System.out.println("Fim");
					System.exit(0);
				break;
				
			default:
				System.out.println("Digite uma op��o v�lida");
				break;
			}
			
		} while (opcao != 0);
		
			teclado.close();
	}
}


