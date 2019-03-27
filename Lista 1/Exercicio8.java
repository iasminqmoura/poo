package lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> frutinhas = new ArrayList<String>();
		
		String frutinha;
		
		System.out.println("Insira o nome das frutinhas: (digite zero para parar.)");
		
		do 
		{
			frutinha = teclado.nextLine();
			
			if(frutinha.equals("zero"))
			{
				break;
			}
			
			else
			{
				frutinhas.add(frutinha);
			}
			
		} while(true);
		
		System.out.println("As frutinhas da lista são: " + frutinhas);
	}

}
