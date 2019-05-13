package iftm.poo.simulado2.Exercicio01;

public class Retangulo extends Forma {
	
	private float lado;
	private float altura;
	
	public Retangulo() {
		super();
	}
	public Retangulo(float lado, float altura) {
		super();
		this.lado = lado;
		this.altura = altura;
	}

	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	public float calcularArea()  {
		return this.getLado() * this.getAltura();
	}

	@Override
	public float calcularPerimetro() {
		return 2 * (this.getAltura() + this.getLado());
	}
}
