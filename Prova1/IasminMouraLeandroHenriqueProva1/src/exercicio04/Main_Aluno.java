package exercicio04;

import java.util.Scanner;

public class Main_Aluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome = null;
		String serie = null;
		int grau = 0;
			
		
		
		Aluno[]alunos = new Aluno[15];
		
		for(int i = 0; i < alunos.length; i++)
		{
			alunos[i] = new Aluno();
			
			System.out.println("Insira o nome: ");
			nome = teclado.nextLine();
			alunos[i].setNome(nome);
			
			System.out.println("Insira a série: ");
			serie = teclado.nextLine();
			alunos[i].setSerie(serie);
			
			System.out.println("Insira o grau: ");
			grau = Integer.parseInt(teclado.nextLine());
			alunos[i].setGrau(grau);
			
		}
		
		
	}

}
