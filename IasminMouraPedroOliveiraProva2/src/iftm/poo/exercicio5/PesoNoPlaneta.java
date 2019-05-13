package iftm.poo.exercicio5;

public class PesoNoPlaneta {
	
	private static double mercurio = 0.38f;
	private static double venus = 0.91f;
	private static double marte = 0.38f;
	private static double jupter = 2.34f;
	private static double saturno = 1.06f;
	private static double urano = 0.92f;
	private static double netuno = 1.19f;
	private double peso;
	private int opcao;
	
	
	public PesoNoPlaneta(double peso, int opcao){
		this.peso = peso;
		this.opcao = opcao;
		
	}
	
	
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public int getOpcao() {
		return opcao;
	}


	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}


	public static double getMercurio() {
		return mercurio;
	}
	
	public static void setMercurio(double mercurio) {
		PesoNoPlaneta.mercurio = mercurio;
	}

	public static double getVenus() {
		return venus;
	}

	public static void setVenus(double venus) {
		PesoNoPlaneta.venus = venus;
	}

	public static double getMarte() {
		return marte;
	}

	public static void setMarte(double marte) {
		PesoNoPlaneta.marte = marte;
	}

	public static double getJupter() {
		return jupter;
	}

	public static void setJupter(double jupter) {
		PesoNoPlaneta.jupter = jupter;
	}

	public static double getSaturno() {
		return saturno;
	}

	public static void setSaturno(double saturno) {
		PesoNoPlaneta.saturno = saturno;
	}

	public static double getUrano() {
		return urano;
	}

	public static void setUrano(double urano) {
		PesoNoPlaneta.urano = urano;
	}

	public static double getNetuno() {
		return netuno;
	}

	public static void setNetuno(double netuno) {
		PesoNoPlaneta.netuno = netuno;
	}

	public double calculaPeso() throws Exception
	{
		if(this.getOpcao() == 1)
		{
			return this.getPeso() * PesoNoPlaneta.getMercurio();
		}
		
		else if(this.getOpcao() == 2)
		{
			return this.getPeso() * PesoNoPlaneta.getVenus();
		}
		
		else if(this.getOpcao() == 3)
		{
			return this.getPeso() * PesoNoPlaneta.getMarte();
		}
		
		else if(this.getOpcao() == 4)
		{
			return this.getPeso() * PesoNoPlaneta.getJupter();
		}
		
		else if(this.getOpcao() == 5)
		{
			return this.getPeso() * PesoNoPlaneta.getSaturno();
		}
		
		else if(this.getOpcao() == 6)
		{
			return this.getPeso() * PesoNoPlaneta.getUrano();
		}
		
		else if(this.getOpcao() == 7)
		{
			return this.getPeso() * PesoNoPlaneta.getNetuno();
		}
		else
		{
			Exception erro = new Exception();
			throw erro;
		}
		
		
	}
	
	
	
	
}
