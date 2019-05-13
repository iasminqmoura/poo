package iftm.poo.simulado2.Exercicio02;

public class Main {
	
	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor();
		Empregado empregado = new Empregado();
	
		fornecedor.setNome("Jo�o do Caminh�o");
		fornecedor.setEndereco("Avenida das Caixas, 123");
		fornecedor.setTelefone("(31)6 9996-6612");
		fornecedor.setValorCredito(5000);
		fornecedor.setValorDivida(2000);
		System.out.println("Dados fornecedor");
		System.out.println("Nome: " + fornecedor.getNome());
		System.out.println("Endere�o: " + fornecedor.getEndereco());
		System.out.println("Telefone: " + fornecedor.getTelefone());
		System.out.println("Cr�dito: " + fornecedor.getValorCredito());
		System.out.println("D�vida: " + fornecedor.getValorDivida());
		System.out.println("Saldo: " + fornecedor.obterSaldo());
		
		System.out.println();
		
		empregado.setNome("Jos� Descarregador");
		empregado.setEndereco("Alameda dos Produtos, 987");
		empregado.setTelefone("(08)3 1233-2100");
		empregado.setCodigoSetor(24);
		empregado.setSalarioBase(2469);
		System.out.println("Dados empregado");
		System.out.println("Nome: " + empregado.getNome());
		System.out.println("Endere�o: " + empregado.getEndereco());
		System.out.println("Telefone: " + empregado.getTelefone());
		System.out.printf("Sal�rio: %.2f\n", empregado.calcularSalario());
	
	}
}
