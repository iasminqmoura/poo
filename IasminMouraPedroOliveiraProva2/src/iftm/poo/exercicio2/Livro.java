package iftm.poo.exercicio2;

public abstract class Livro {

	private String titulo;
	private String autor;
	private int numeroPaginas;
	private int anoEdicao;
	
	public Livro() {}
	public Livro(String titulo, String autor, int numeroPaginas, int anoEdicao) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.anoEdicao = anoEdicao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public int getAnoEdicao() {
		return anoEdicao;
	}
	public void setAnoEdicao(int anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	
	public String toString() {
		return "Livro";
	}
}
