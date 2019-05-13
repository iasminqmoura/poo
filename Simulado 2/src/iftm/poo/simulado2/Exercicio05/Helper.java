package iftm.poo.simulado2.Exercicio05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public final class Helper {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static LocalDate converteStringData(String data)
	{
		return LocalDate.parse(data);
	}
	
	public static String converteDateString(LocalDate data)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return data.format(formatter);
	}
}
