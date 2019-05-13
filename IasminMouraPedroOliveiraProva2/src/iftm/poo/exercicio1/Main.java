package iftm.poo.exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Insira os dados do cliente: ");
		Cliente c = new Cliente(sc.nextLine(), Integer.valueOf(sc.nextLine()), sc.nextLine(), 
				Double.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()));
		System.out.println("Insira os dados do gerente: ");
		Gerente g = new Gerente(sc.nextLine(), Integer.valueOf(sc.nextLine()), sc.nextLine(), 
				Double.valueOf(sc.nextLine()), sc.nextLine(), sc.nextLine());
		System.out.println("Insira os dados do vendedor: ");
		Vendedor v = new Vendedor(sc.nextLine(), Integer.valueOf(sc.nextLine()), sc.nextLine(), 
				Double.valueOf(sc.nextLine()), sc.nextLine(), Double.valueOf(sc.nextLine()), sc.nextInt());
		
		System.out.print("Dados ");
		System.out.print(c.toString());
		System.out.println("\nNome:" + c.getNome());
		System.out.println("Idade: " + c.getIdade());
		System.out.println("Sexo: " + c.getSexo());
		System.out.println("Valor Divida:" + c.getValorDivida());
		System.out.println("Ano de Nascimento: " + c.getAnoNascim());
		
		System.out.println();
		
		System.out.print("Dados ");
		System.out.print(g.toString());
		System.out.println("\nNome:" + g.getNome());
		System.out.println("Idade: " + g.getIdade());
		System.out.println("Sexo: " + g.getSexo());
		System.out.println("Salário: " + g.getSalario());
		System.out.println("Matrícula: "+ g.getMatricula());
		System.out.println("Nome gerencia: " + g.getNomeGerencia());
		System.out.println("Valor INSS: " + g.valorInss());
		
		System.out.println();
		
		System.out.print("Dados ");
		System.out.print(v.toString());
		System.out.println("\nNome:" + v.getNome());
		System.out.println("Idade: " + v.getIdade());
		System.out.println("Sexo: " + v.getSexo());
		System.out.println("Salário: " + v.getSalario());
		System.out.println("Matrícula: "+ v.getMatricula());
		System.out.println("Valor Vendas: " + v.getValorVendas());
		System.out.println("Quantidade de Vendas: " + v.getQntVendas());
		System.out.println("Valor INSS: " + v.valorInss());
		
		sc.close();
		
	}

}
