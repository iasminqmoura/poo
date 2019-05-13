package iftm.poo.simulado2.Exercicio04;

public class Prova {
	
	private Gabarito gabarito;
	private char[] respostas;
	
	private int cont = 0;
	
	public Prova(Gabarito gabarito) 
	{
		this.gabarito = gabarito;
		respostas = new char[gabarito.tamanhoProva()];
	}
	
	public void respostaAluno(char resposta)
	{
		respostas[cont] = resposta;
		cont++;
	}
	
	public int acertos()
	{
		int contAcertos = 0;
		
		for(int i = 0; i < gabarito.tamanhoProva(); i++)
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
		
		//valeMeio = 2/3 da quantidade de questões da prova
		int valeMeio = 2 * (gabarito.tamanhoProva() / 3);
		
		//de 0 até 2/3
		for(int i = 0; i < valeMeio; i++)
		{
			if(respostas[i] == gabarito.respostaQuestao(i))
			{
				notaFinal = notaFinal + 0.5f;
			}
		}
		
		//de 2/3 até a qnt final de questões
		for(int i = valeMeio; i < gabarito.tamanhoProva(); i++)
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
