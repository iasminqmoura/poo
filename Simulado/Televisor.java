package iftm.poo.simulado1;

public class Televisor {
	private boolean ligado;
	private int volume;
	private int canal;
	private int volumeMaximo;
	private int numeroCanais;
	
	public Televisor() {}
	
	public Televisor(boolean ligado, int volume, int canal, int volumeMaximo, int numeroCanais) {
		this.ligado = ligado;
		this.volume = volume;
		this.canal = canal;
		this.volumeMaximo = volumeMaximo;
		this.numeroCanais = numeroCanais;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getVolumeMaximo() {
		return volumeMaximo;
	}

	public void setVolumeMaximo(int volumeMaximo) {
		this.volumeMaximo = volumeMaximo;
	}

	public int getNumeroCanais() {
		return numeroCanais;
	}

	public void setNumeroCanais(int numeroCanais) {
		this.numeroCanais = numeroCanais;
	}

	public void ligarDesligar() {
		if(this.isLigado()) {
			this.setLigado(false);
		}
		else {
			this.setLigado(true);
		}
	}
	
	public void canalAcima() {
		if(this.getNumeroCanais() == this.getCanal()) {
			this.setCanal(1);
		}else {
			this.setCanal((this.getCanal()+1));
		}
	}
	
	public void canalAbaixo() {
		if(this.getCanal() == 1) {
			this.setCanal(getNumeroCanais());
		}else {
			this.setCanal((this.getCanal()-1));
		}
	}
	
	public void volumeAcima() {
		if(this.getVolume() < this.getVolumeMaximo()) {
			this.setVolume((this.getVolume()+1));
		}
		else {
			System.out.println("Volume já está no máximo");
		}
	}
	
	public void volumeAbaixo() {
		if(this.getVolume()>0) {
			this.setVolume((this.getVolume()-1));
		}
		else{
			System.out.println("Volume já está no minimo");
		}
	}
	
	public void imprimir() {
		System.out.println("Está ligado? -> " + this.isLigado());
		System.out.println("Volume: " + this.getVolume());
		System.out.println("Volume máximo: " + this.getVolumeMaximo());
		System.out.println("Canal: " + this.getCanal());
		System.out.println("Númeor de Canais: " + this.getNumeroCanais());
		System.out.println();System.out.println();
	}
}
