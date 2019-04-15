package iftm.poo.simulado1;

public class Circulo {
	private double raio;
	private double area;
	private double perimetro;
	private static double pi = 3.141516;

	public Circulo() {}
	
	public static double getPi() {
		return pi;
	}
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
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
		setArea(this.getPi() * this.getRaio() * this.getRaio());
	}
	
	public void calcularPerimetro() {
		setPerimetro(this.getPi() * 2 * this.getRaio());
	}
	
	public void imprimir() {
		System.out.println("Raio: " + this.getRaio());
		System.out.println("Área: " + this.getArea());
		System.out.println("Perimetro:" + this.getPerimetro());
		System.out.println("Pi: " + this.getPi());
	}
	
}
