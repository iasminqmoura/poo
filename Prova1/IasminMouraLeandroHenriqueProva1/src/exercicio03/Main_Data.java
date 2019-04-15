package exercicio03;

import java.util.Scanner;

public class Main_Data {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int mes = 0, dia = 0, ano = 0;
	
		Data datas = new Data(mes, dia, ano);
		
		System.out.println("Insira o dia: ");
		dia = teclado.nextInt();
		
		System.out.println("Insira o mês: ");
		mes = teclado.nextInt();
		
		System.out.println("Insira o ano: ");
		ano = teclado.nextInt();
		
		datas.setDia(dia);
		datas.setMes(mes);
		datas.setAno(ano);
		
		datas.quantidadeDias(0);
		
		datas.imprimeData();		
		
		System.out.println("Quantidade de dias até a data inserida: " + datas.quantidadeDias(mes));
	}

}
