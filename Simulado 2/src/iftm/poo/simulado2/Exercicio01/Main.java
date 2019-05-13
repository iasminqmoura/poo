package iftm.poo.simulado2.Exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		
		float aux;
		
		System.out.println("Formas geom�tricas\n");
		
		System.out.println("Ret�ngulo");
		System.out.print("Altura: ");
		retangulo.setAltura(teclado.nextFloat());
		
		System.out.print("Lado: ");
		retangulo.setLado(teclado.nextFloat());
		
		System.out.println();
		
		System.out.println("Circulo");
		System.out.print("Raio: ");
		circulo.setRaio(teclado.nextFloat());
		
		circulo.calcularArea();
		circulo.calcularPerimetro();
		
		System.out.println();
		
		System.out.println("Quadrado");
		System.out.print("Lado: ");
		quadrado.setLado(teclado.nextFloat());
		
		while(true)
		{
			System.out.print("Altura: ");
			aux = teclado.nextFloat();
			
			if(aux != quadrado.getLado())
			{
				System.out.println("O lado e a altura do quadrado devem ser iguais.");
			}
			else
			{
				quadrado.setAltura(aux);
				break;
			}
			
		}
		
		System.out.println();
		
		System.out.println("�reas: ");
		System.out.println("Ret�ngulo: " + retangulo.calcularArea());
		System.out.println("C�rculo: " + circulo.calcularArea());
		System.out.println("Quadrado: " + quadrado.calcularArea());
		
		System.out.println();
		
		System.out.println("Per�metros: ");
		System.out.println("Ret�ngulo: " + retangulo.calcularPerimetro());
		System.out.println("C�rculo: " + circulo.calcularPerimetro());
		System.out.println("Quadrado: " + quadrado.calcularPerimetro());
		
		teclado.close();
	}
}
