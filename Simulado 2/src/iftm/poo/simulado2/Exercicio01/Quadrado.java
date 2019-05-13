package iftm.poo.simulado2.Exercicio01;

public class Quadrado extends Retangulo {
	
	public Quadrado() {
		super();
	}
	public Quadrado(float lado, float altura) {
		super(lado, altura);
	}
	
	@Override
	public float calcularArea()  {
		
		return this.getLado()*this.getAltura();
	}
	
	@Override
	public float calcularPerimetro() {

		return 2*(this.getAltura()+this.getLado());
	}

}
