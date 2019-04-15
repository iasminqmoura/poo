package iftm.poo.simulado1;

public class Quadrado {

	private double lado;
	private double area;
	private double perimetro;
	
	public Quadrado() {}
	
	public Quadrado(double lado) {
		this.lado = lado;
		
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
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
		this.setArea(this.lado * this.lado);
	}
	
	public void calcularPerimetro() {
		this.setPerimetro(this.lado*4);
	}
	
	public void imprimir() {
		System.out.println("Lado: "+this.getLado());
		System.out.println("Área: "+this.getArea());
		System.out.println("Perimetro: "+this.getPerimetro());
	}
}
