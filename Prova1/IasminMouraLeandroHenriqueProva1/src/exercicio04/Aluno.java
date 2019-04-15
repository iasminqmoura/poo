package exercicio04;

public class Aluno {
	
	private static int quantidade = 0;
	private String nome;
	private String serie;
	private int grau;
	
	
	public Aluno() {
		
		quantidade++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public int getGrau() {
		return grau;
	}
	public void setGrau(int grau) {
		this.grau = grau;
	}
	public void finalize()
	{
		quantidade--;
	}
	

}
