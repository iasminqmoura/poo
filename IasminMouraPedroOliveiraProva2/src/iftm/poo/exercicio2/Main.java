package iftm.poo.exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira os dados do livro na ordem:");
		System.out.println("Titulo / Autor / Numero P�ginas / Ano edi��o / Status Empr�stimo / Localiza��o / Descri��o");
		LivroDeBiblioteca livro = new LivroDeBiblioteca(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine()),
				Integer.valueOf(sc.nextLine()), Boolean.valueOf(sc.nextLine()), sc.nextLine(), sc.nextLine());
		System.out.println("To string: " + livro.toString());
		System.out.println("Imprimindo os dados: ");
		System.out.println("Titulo: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Numero de p�ginas:" + livro.getNumeroPaginas());
		System.out.println("Ano de edi��o: " + livro.getAnoEdicao());
		System.out.println("Status de empr�stimo: " + livro.isEmprestado());
		System.out.println("Localiza��o: " + livro.localiza());
		System.out.println("Descri��o: " + livro.apresentaDescricao());
		
		try {
			livro.empresta();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("N�o se pode emprestar um livro que j� est� emprestado.");
		}
		
		try {
			livro.empresta();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("N�o se pode emprestar um livro que j� est� emprestado.");
		}
		
		try {
			livro.devolve();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("N�o se pode devolver um livro que j� est� devolvido.");
		}
		
		try {
			livro.devolve();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("N�o se pode devolver um livro que j� est� devolvido.");
		}

		System.out.println("Imprimindo os dados: ");
		System.out.println("Titulo: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Numero de p�ginas:" + livro.getNumeroPaginas());
		System.out.println("Ano de edi��o: " + livro.getAnoEdicao());
		System.out.println("Status de empr�stimo: " + livro.isEmprestado());
		System.out.println("Localiza��o: " + livro.localiza());
		System.out.println("Descri��o: " + livro.apresentaDescricao());
		
		sc.close();
	}

}
