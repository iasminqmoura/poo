package iftm.poo.simulado2.Exercicio05;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Insira a data (ANO-MÊS-DIA): ");
		String data = Helper.teclado.nextLine();
		
		LocalDate localData = Helper.converteStringData(data);
		
		System.out.println("Data brasileira: " + Helper.converteDateString(localData));
	}

}
