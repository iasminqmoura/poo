package exercicio03;

public class Data {

	private int mes;
	private int dia;
	private int ano;
	
	
	public Data(int mes, int dia, int ano) {
		super();
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if(mes < 1 || mes > 12)
		{
			System.out.println("Insira um mês válido");
		}
		else
		{
			this.mes = mes;
		}
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if(mes % 2 == 0)
		{
			if(dia < 1 || dia > 30)
			{
				System.out.println("Insira um dia válido.");
			}
			else
			{
				this.dia = dia;
			}
		}
		else
		{
			if(dia < 1 || dia > 31)
			{
				System.out.println("Insira um dia válido");
			}
			else
			{
				this.dia = dia;
			}
		}
		
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void imprimeData()
	{
		System.out.println("DD/MM/AAAA: "+dia+"/"+mes+"/"+ano);
	}
	
	public int quantidadeDias(int mes)
	{
		mes++;
		return (mes/2) * 31 + ((mes - 1)/2) * 30;
	}

}
