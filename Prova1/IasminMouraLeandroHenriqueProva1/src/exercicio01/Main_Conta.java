package exercicio01;

import java.util.Scanner;

public class Main_Conta {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float saldo, debito, credito;
		int opcao;
		
		System.out.println("Insira o saldo da conta: ");
		saldo = teclado.nextFloat();
		
		Conta contas = new Conta(saldo);
		
		System.out.println("Insira qual operação deseja efetuar: ");
		
		System.out.println("1 - Débito");
		System.out.println("2 - Crédito");
		opcao = teclado.nextInt();
		
		if(opcao < 1 || opcao > 2)
		{
			System.out.println("Insira uma opção válida");
		}
		else
		{
			if(opcao == 1)
			{
				System.out.println("Insira o valor a ser debitado da conta");
				debito = teclado.nextFloat();
				
				contas.debito(debito);
				contas.getSaldo();
				
				System.out.println("Saldo disponível após o débito: " + contas.getSaldo());
			}
			
			if(opcao == 2)
			{
				System.out.println("Insira o valor a ser creditado da conta");
				credito = teclado.nextFloat();
				
				contas.debito(credito);
				contas.getSaldo();
				
				System.out.println("Saldo disponível após o crédito: " + contas.getSaldo());
			}
		
		}
		
		
	}

}
