package iftm.poo.exercicio3;

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
	
}
