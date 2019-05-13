package iftm.poo.exercicio1;

public class Gerente extends Empregado{

	private String nomeGerencia;
	
	public Gerente() {}
	public Gerente(String nome, int idade, String sexo, double salario, 
			String matricula, String nomeGerencia) {
		super(nome, idade, sexo, salario, matricula);
		this.nomeGerencia = nomeGerencia;
	}
	
	public String getNomeGerencia() {
		return nomeGerencia;
	}
	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	public String toString() {
		return "Gerente";
	}
	
}
