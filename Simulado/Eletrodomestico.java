package iftm.poo.simulado1;

public class Eletrodomestico {

	private boolean ligado;
	
	public Eletrodomestico() {}
	public Eletrodomestico(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
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
		System.out.println("Está ligado? ->" + this.isLigado());
	}
}
