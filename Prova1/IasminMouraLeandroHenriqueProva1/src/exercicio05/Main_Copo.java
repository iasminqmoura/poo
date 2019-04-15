package exercicio05;

import java.util.Scanner;

public class Main_Copo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int capacidadeMaxima;
		int capacidadeAtual;
		String cor;
		String material;
		int opcao;
		
		System.out.println("Insira informações sobre o copo: ");
		
		Copo copos = new Copo();
		
		System.out.println("Capacidade máxima (em ml): ");
		capacidadeMaxima = Integer.parseInt(teclado.nextLine());
		copos.setCapacidadeMaxima(capacidadeMaxima);
		
		System.out.println("Capacidade atual (em ml): ");
		capacidadeAtual = Integer.parseInt(teclado.nextLine());
		copos.setCapacidadeAtual(capacidadeAtual);
		
		System.out.println("Cor: ");
		cor = teclado.nextLine();
		copos.setCor(cor);
		
		System.out.println("Material: ");
		material = teclado.nextLine();
		copos.setMaterial(material);
		
		System.out.println("Digite 1 para encher o copo ou 2 para esvaziar");
		opcao = Integer.parseInt(teclado.nextLine());
		
		if(opcao == 1)
		{
			copos.encher();
		}
		else if(opcao == 2)
		{
			copos.esvaziar();
		}
		else
		{
			System.out.println("Insira uma opção válida.");
		}
		
		
		copos.getInformacoes();
	}

}
