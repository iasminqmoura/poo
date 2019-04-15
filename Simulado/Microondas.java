package iftm.poo.simulado1;

public class Microondas {

	private boolean ligado;
	private boolean portaFechada;
	public Microondas() {}
	
	public Microondas(boolean ligado, boolean portaFechada) {
		this.ligado = ligado;
		this.portaFechada = portaFechada;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isPortaFechada() {
		return portaFechada;
	}

	public void setPortaFechada(boolean portaFechada) {
		this.portaFechada = portaFechada;
	}
	
	public void ligarDesligar() {
		if(this.isPortaFechada()) {
			if(this.isLigado()) {
				this.setLigado(false);
			}
			else {
				this.setLigado(true);
			}
		}
		else{
			System.out.println("A porta está aberta. Não vai ligar.");
		}
		
	}
	
	public void fecharPorta() {
		if(this.isPortaFechada() == false) {
			this.setPortaFechada(true);
		}else {
			System.out.println("A porta já está fechada");
		}
	}
	
	public void abrirPorta() {
		if(this.isPortaFechada()) {
			this.setPortaFechada(false);
		}
		else {
			System.out.println("A porta já está aberta");
		}
	}
	
	public void imprimir() {
		System.out.println("Porta fechada? -> " + this.isPortaFechada());
		System.out.println("Está ligado? -> " + this.isLigado());
		System.out.println();System.out.println();
	}
}
