package iftm.poo.simulado2.Exercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Gabarito gabarito = new Gabarito(new char[] 
		{
				'A', 'E', 'B', 'D', 'C', 'A', 'E', 'B', 'D', 'C', 'A', 'E', 'B', 'D', 'C'
		});
		
		Prova prova = new Prova(gabarito);
		Prova prova2 = new Prova(gabarito);
		
		System.out.println("Insira as respostas da prova 1: ");
		for(int i = 0; i < gabarito.tamanhoProva(); i ++)
		{
			prova.respostaAluno(teclado.next().charAt(0));
		}
		
		System.out.println("Insira as respostas da prova 2: ");
		for(int i = 0; i < gabarito.tamanhoProva(); i ++)
		{
			prova2.respostaAluno(teclado.next().charAt(0));
		}
		
		System.out.println();
		
		System.out.println("Quantidade de acertos da prova 1: " + prova.acertos());
		System.out.println("Quantidade de acertos da prova 2: " + prova2.acertos());
		
		System.out.println();
		
		System.out.println("Nota prova 1: " + prova.nota());
		System.out.println("Nota prova 2: " + prova2.nota());
		
		System.out.println("Maior: " + prova.maior(prova2));
		
		teclado.close();
	}

}
