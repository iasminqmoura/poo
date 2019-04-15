package iftm.poo.simulado1;

public class Retângulo {
	private double comprimento;
	private double largura;
	private double area;
	private double perimetro;
	
	public Retângulo() {}
	
	public Retângulo(double comprimento, double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	private double getArea() {
		return area;
	}

	private void setArea(double area) {
		this.area = area;
	}

	private double getPerimetro() {
		return perimetro;
	}

	private void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public void calcularArea() {
		setArea(this.largura * this.comprimento);
	}
	
	public void calcularPerimetro() {
		setPerimetro(this.largura * 2 + this.comprimento * 2);
	}
	
	public void imprimir() {
		System.out.println("Comprimento: " + this.getComprimento());
		System.out.println("Largura: " + this.getLargura());
		System.out.println("Área: " + this.getArea());
		System.out.println("Perimetro: " + this.perimetro);
	}
}
