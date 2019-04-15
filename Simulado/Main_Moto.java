package iftm.poo.simulado1;

public class Main_Moto {

	public static void main(String[] args) {
		Moto m = new Moto("A", "A-13", "Azul", 1,6,0,true);
		m.imprimir();
		
		m.marchaABaixo();

		m.ligarDesligar();
		m.imprimir();
		m.marchaABaixo();
		m.imprimir();
	}

}
