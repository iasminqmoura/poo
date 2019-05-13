package iftm.poo.simulado2.Exercicio02;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto = 10;
	
	public Empregado() {
		super();	
	}

	public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto) {
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
		
	public double calcularSalario() {
		
		float porcentagemImposto = (this.getSalarioBase() * this.getImposto()) /100;
		return this.getSalarioBase() - porcentagemImposto;
		
	}
	
}
