package exercicio05;

public class Copo {

	private int capacidadeMaxima;
	private int capacidadeAtual;
	private String cor;
	private String material;
	
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public int getCapacidadeAtual() {
		return capacidadeAtual;
	}
	public void setCapacidadeAtual(int capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void encher() {
		if(capacidadeAtual == capacidadeMaxima)
		{
			System.out.println("O copo esborrou.");
		}
		else
		{
			capacidadeAtual++;
		}
	}
	
	public void esvaziar() {
		if(capacidadeAtual == 0)
		{
			System.out.println("O copo está vazio.");
		}
		else
		{
			capacidadeAtual--;
		}
	}
	
	public void getInformacoes()
	{
		System.out.println("O copo "+cor+" de "+material+" armazena até "+capacidadeMaxima+"ml e atualmente contém "+capacidadeAtual+"ml de líquido.");
	}

}
