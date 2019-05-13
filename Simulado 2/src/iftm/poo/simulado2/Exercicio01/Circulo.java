package iftm.poo.simulado2.Exercicio01;

public class Circulo extends Forma{
	private float raio;
	
	public Circulo() {
		super();
	}
	public Circulo(float raio) {
		this.raio = raio;
	}
	
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	@Override
	public float calcularArea() {
		
		return (float)(Math.PI * Math.pow(this.getRaio(), 2));
	}

	@Override
	public float calcularPerimetro() {
	
		return (float) (2 *this.getRaio() * Math.PI);
	}
}
