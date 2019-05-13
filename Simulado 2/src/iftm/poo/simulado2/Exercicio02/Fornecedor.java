package iftm.poo.simulado2.Exercicio02;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
    private double valorDivida;
    
    public Fornecedor(){
    	super();
    }

	public Fornecedor(String nome, String endereco, String telefone, 
		float valorCredito, float valorDivida) {
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	public double obterSaldo(){
		
		return this.getValorCredito()-this.getValorDivida();
		
	}
	
	
}



