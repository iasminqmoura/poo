package iftm.poo.simulado1;

public class Moto {

	private String marca;
	private String modelo;
	private String cor;
	private int marcha;
	private int maiorMarcha;
	private int menorMarcha;
	private boolean ligado;
	
	public Moto() {}
	public Moto(String marca, String modelo, String cor, int marcha, int maiorMarcha, int menorMarcha, boolean ligado) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
		this.maiorMarcha = maiorMarcha;
		this.menorMarcha = menorMarcha;
		this.ligado = ligado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	public int getMaiorMarcha() {
		return maiorMarcha;
	}
	public void setMaiorMarcha(int maiorMarcha) {
		this.maiorMarcha = maiorMarcha;
	}
	public int getMenorMarcha() {
		return menorMarcha;
	}
	public void setMenorMarcha(int menorMarcha) {
		this.menorMarcha = menorMarcha;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void marchaAcima() {
		if(this.getMarcha() >= this.getMaiorMarcha()) {
			System.out.println("Marcha já está no máximo");
		}
		else {
			this.setMarcha(this.getMarcha()+1);
		}
	}
	
	public void marchaABaixo() {
		if(this.getMarcha() <=this.getMenorMarcha()) {
			System.out.println("Marcha já está no minimo");
		}
		else {
			this.setMarcha(this.getMarcha()-1);
		}
	}
	
	public void ligarDesligar() {
		if(this.isLigado()) {
			this.setLigado(false);
		}
		else {
			this.setLigado(true);
		}
	}
	
	public void imprimir() {
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Marcha " + this.getMarcha());
		System.out.println("Maior marcha: " + this.getMaiorMarcha());
		System.out.println("Menor marcha: " + this.getMenorMarcha());
		System.out.println("Está ligado? -> " + this.isLigado());
		System.out.println();System.out.println();
	}
}
