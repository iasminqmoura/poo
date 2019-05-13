package iftm.poo.exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira os dados do livro na ordem:");
		System.out.println("Titulo / Autor / Numero Páginas / Ano edição / Status Empréstimo / Localização / Descrição");
		LivroDeBiblioteca livro = new LivroDeBiblioteca(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine()),
				Integer.valueOf(sc.nextLine()), Boolean.valueOf(sc.nextLine()), sc.nextLine(), sc.nextLine());
		System.out.println("To string: " + livro.toString());
		System.out.println("Imprimindo os dados: ");
		System.out.println("Titulo: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Numero de páginas:" + livro.getNumeroPaginas());
		System.out.println("Ano de edição: " + livro.getAnoEdicao());
		System.out.println("Status de empréstimo: " + livro.isEmprestado());
		System.out.println("Localização: " + livro.localiza());
		System.out.println("Descrição: " + livro.apresentaDescricao());
		
		try {
			livro.empresta();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Não se pode emprestar um livro que já está emprestado.");
		}
		
		try {
			livro.empresta();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Não se pode emprestar um livro que já está emprestado.");
		}
		
		try {
			livro.devolve();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Não se pode devolver um livro que já está devolvido.");
		}
		
		try {
			livro.devolve();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Não se pode devolver um livro que já está devolvido.");
		}

		System.out.println("Imprimindo os dados: ");
		System.out.println("Titulo: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Numero de páginas:" + livro.getNumeroPaginas());
		System.out.println("Ano de edição: " + livro.getAnoEdicao());
		System.out.println("Status de empréstimo: " + livro.isEmprestado());
		System.out.println("Localização: " + livro.localiza());
		System.out.println("Descrição: " + livro.apresentaDescricao());
		
		sc.close();
	}

}
