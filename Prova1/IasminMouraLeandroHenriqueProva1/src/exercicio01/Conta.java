package exercicio01;

public class Conta {

	private float saldo;

	
	public Conta(float saldo) {
		
		if(saldo < 0 )
		{
			this.saldo = 0;
			System.out.println("Não é possível inserir um saldo negativo, o valor da conta iniciará em zero");
		}
		else
		{
			this.saldo = saldo;
		}
		
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float credito(float credito)
	{
		return saldo + credito;
	}
	
	public void debito(float debito)
	{
		if(debito > saldo)
		{
			System.out.println("Saldo insuficiente para efetuar a operação.");
		}
		
		else
		{
			saldo = saldo - debito;
		}
		
	}
}
