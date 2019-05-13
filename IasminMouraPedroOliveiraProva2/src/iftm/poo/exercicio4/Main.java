package iftm.poo.exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira com qual tipo de mão usar: \n[0] - Pedra\n[1] - Papel\n[2] - Tesoura");
		System.out.print("-> ");
		JogoPedraPapelTesoura jppt = new JogoPedraPapelTesoura(sc.nextInt());
		if(jppt.getUsuario() != -1) {
			System.out.println(jppt.retornaGanhador());	
			
			System.out.println("Maquina jogou: " + jppt.getMaquina());
		}
	
		
		sc.close();
	}

}
