package iftm.poo.exercicio3;

public class Prova {
	
	private Gabarito gabarito;
	private char[] respostas;
	
	private int cont = 0;
	
	public Prova(Gabarito gabarito) 
	{
		this.gabarito = gabarito;
		respostas = new char[15];
	}
	
	public void respostaAluno(char resposta)
	{
		respostas[cont] = resposta;
		cont++;
	}
	
	public int acertos()
	{
		int contAcertos = 0;
		
		for(int i = 0; i < 15; i++)
		{
			if(respostas[i] == gabarito.respostaQuestao(i))
			{
				contAcertos++;
			}
		}
		
		return contAcertos;
	}
	
	public float nota()
	{
		float notaFinal = 0;
		
		for(int i = 0; i < 10; i++)
		{
			if(respostas[i] == gabarito.respostaQuestao(i))
			{
				notaFinal = notaFinal + 0.5f;
			}
		}
		
		for(int i = 10; i < 15; i++)
		{
			if(respostas[i] == gabarito.respostaQuestao(i))
			{
				notaFinal = notaFinal + 1f;
			}
		}
		
		return notaFinal;
	}
	
	public float maior(Prova outraProva)
	{
		float maior;
		
		if(this.acertos() == outraProva.acertos())
		{
			if(this.nota() > outraProva.nota())
			{
				maior = this.nota();
			}
			else
			{
				maior = outraProva.nota();
			}
		}
		else if(this.acertos() > outraProva.acertos())
		{
			maior = this.nota();
		}
		else
		{
			maior = outraProva.nota();
		}
		
		return maior;
	}
}
