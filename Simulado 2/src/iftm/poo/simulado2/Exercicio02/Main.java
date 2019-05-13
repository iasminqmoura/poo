package iftm.poo.simulado2.Exercicio02;

public class Main {
	
	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor();
		Empregado empregado = new Empregado();
	
		fornecedor.setNome("João do Caminhão");
		fornecedor.setEndereco("Avenida das Caixas, 123");
		fornecedor.setTelefone("(31)6 9996-6612");
		fornecedor.setValorCredito(5000);
		fornecedor.setValorDivida(2000);
		System.out.println("Dados fornecedor");
		System.out.println("Nome: " + fornecedor.getNome());
		System.out.println("Endereço: " + fornecedor.getEndereco());
		System.out.println("Telefone: " + fornecedor.getTelefone());
		System.out.println("Crédito: " + fornecedor.getValorCredito());
		System.out.println("Dívida: " + fornecedor.getValorDivida());
		System.out.println("Saldo: " + fornecedor.obterSaldo());
		
		System.out.println();
		
		empregado.setNome("José Descarregador");
		empregado.setEndereco("Alameda dos Produtos, 987");
		empregado.setTelefone("(08)3 1233-2100");
		empregado.setCodigoSetor(24);
		empregado.setSalarioBase(2469);
		System.out.println("Dados empregado");
		System.out.println("Nome: " + empregado.getNome());
		System.out.println("Endereço: " + empregado.getEndereco());
		System.out.println("Telefone: " + empregado.getTelefone());
		System.out.printf("Salário: %.2f\n", empregado.calcularSalario());
	
	}
}
