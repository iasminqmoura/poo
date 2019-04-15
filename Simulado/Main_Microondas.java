package iftm.poo.simulado1;

public class Main_Microondas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Microondas m = new Microondas(false, false);
		m.imprimir();
		m.fecharPorta();
		m.imprimir();
		m.fecharPorta();
		m.abrirPorta();
		m.imprimir();
		m.abrirPorta();
		m.ligarDesligar();
		m.fecharPorta();
		m.imprimir();
		m.ligarDesligar();
		m.imprimir();
	}

}
