package iftm.poo.simulado2.Exercicio04;

public class Gabarito {
	
	private char[] respostas;
	
	public Gabarito(char[] respostas) 
	{
		this.respostas = respostas;
	}
	
	public char respostaQuestao(int numeroQuestao)
	{
		return respostas[numeroQuestao];
	}
	
	public int tamanhoProva() 
	{
		return respostas.length;
	}
}
