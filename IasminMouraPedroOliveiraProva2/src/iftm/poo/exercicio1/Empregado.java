package iftm.poo.exercicio1;

public abstract class Empregado extends Pessoa{

	private double salario;
	private String matricula;
	
	public Empregado() {}
	public Empregado(String nome, int idade, String sexo
			, double salario, String matricula) {
		super(nome,idade,sexo);
		this.salario = salario;
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double valorInss() {
		return (this.getSalario() * 0.11);
	}
	
	
}
