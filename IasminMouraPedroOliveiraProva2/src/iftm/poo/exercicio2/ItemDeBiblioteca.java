package iftm.poo.exercicio2;

public interface ItemDeBiblioteca {

	public boolean isEmprestado();
	public void empresta() throws Exception;
	public void devolve() throws Exception;
	public String localiza();
	public String apresentaDescricao();
}
