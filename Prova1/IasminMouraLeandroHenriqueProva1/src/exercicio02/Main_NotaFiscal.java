package exercicio02;

import java.util.Scanner;

public class Main_NotaFiscal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String numero, descricao;
		int quantidade;
		float preco;
	
		NotaFiscal nota = new NotaFiscal();
		
		System.out.println("Insira as informa��es do pedido: ");
		
		System.out.println("Tamanho da pe�a (P, M, G): ");
		numero = teclado.nextLine();
		
		System.out.println("Descri��o da pe�a: ");
		descricao = teclado.nextLine();
		
		System.out.println("Quantidade de pe�as: ");
		quantidade = teclado.nextInt();
		
		System.out.println("Pre�o: ");
		preco = teclado.nextFloat();
		
		nota.setNumeracao(numero);
		nota.setDescricao(descricao);
		nota.setPreco(preco);
		nota.setQuantidade(quantidade);
		
		nota.getTotalNota();
		
		System.out.println("Valor total do pedido: " + nota.getTotalNota());
		
		
	}

}
