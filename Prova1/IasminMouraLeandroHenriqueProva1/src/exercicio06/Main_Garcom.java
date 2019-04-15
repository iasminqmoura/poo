package exercicio06;

import java.util.Scanner;

import exercicio05.Copo;

public class Main_Garcom {

	public static void main(String[] args) {
		
		int capacidadeMaxima;
		int capacidadeAtual;
		String cor;
		String material;
		int opcao;
		
		Scanner teclado = new Scanner(System.in);
		Garcom garcons = new Garcom();
		
		for(int i = 0; i < garcons.getCopos().length; i++)
		{
			garcons.getCopos()[i] = new Copo();
			
			System.out.println("Capacidade máxima (em ml): ");
			capacidadeMaxima = Integer.parseInt(teclado.nextLine());
			garcons.getCopos()[i].setCapacidadeMaxima(capacidadeMaxima);
			
			System.out.println("Capacidade atual (em ml): ");
			capacidadeAtual = Integer.parseInt(teclado.nextLine());
			garcons.getCopos()[i].setCapacidadeAtual(capacidadeAtual);
			
			System.out.println("Cor: ");
			cor = teclado.nextLine();
			garcons.getCopos()[i].setCor(cor);
			
			System.out.println("Material: ");
			material = teclado.nextLine();
			garcons.getCopos()[i].setMaterial(material);
			
			System.out.println("Digite 1 para encher o copo ou 2 para esvaziar");
			opcao = Integer.parseInt(teclado.nextLine());
			
			if(opcao == 1)
			{
				garcons.getCopos()[i].encher();
			}
			else if(opcao == 2)
			{
				garcons.getCopos()[i].esvaziar();
			}
			else
			{
				System.out.println("Insira uma opção válida.");
			}
		
			garcons.getCopos()[i].getInformacoes();
		}

	}

}
