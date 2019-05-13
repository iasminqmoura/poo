package iftm.poo.exercicio4;

public class JogoPedraPapelTesoura {

	private int usuario;
	private int maquina;
	
	public JogoPedraPapelTesoura() {};
	
	public JogoPedraPapelTesoura(int usuario){
		try {
			this.setUsuario(usuario);
		} catch (Exception e) {
			this.usuario = -1;
			System.out.println("N�o existe pedra/papel/tesoura com valores diferentes de 0 1 e 2");
		}
		this.maquina = JogoPedraPapelTesoura.randInt(0, 2);
	}
	
	public static int randInt(int min, int max) {
		int randomNum = (int) ((Math.random()*((max-min)+1))+min);
		return randomNum;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) throws Exception{
		if(usuario < 0 || usuario >2) {
			Exception erro = new Exception();
			throw erro;
		}
		else {
			this.usuario = usuario;	
		}
	}

	public int getMaquina() {
		return maquina;
	}

	public void setMaquina(int maquina) {
		this.maquina = maquina;
	}
	
	public String retornaGanhador() {
		 if(this.getUsuario() == 0) { // Usu�rio = Pedra
			 if(this.getMaquina() == 0) { // Maquina = pedra
				 return "Empate de " + this.getUsuario();
			 }
			 else if(this.getMaquina() == 1) { // Maquina = papel
				 return ("Maquina ganhou com " + this.getMaquina());
			 }
			 else {
				 return ("Usu�rio ganhou com " + this.getUsuario()); // MAquina = Tesoura
			 }
		 }
		 else if(this.getUsuario() == 1) { // Usu�rio = Papel
			 if(this.getMaquina() == 0) { // Maquina = Pedra
				 return ("Usu�rio ganhou com " + this.getUsuario());
			 }
			 else if(this.getMaquina() == 1) { // Maquina = papel
				 return "Empate de " + this.getUsuario();
			 }
			 else {
				 return ("M�quina ganhou com " + this.getMaquina()); // Maquina = Tesoura
			 }
		}
		else { // Usu�rio = Tesoura
			if(this.getMaquina() == 0) { // Maquina = Pedra
				 return  ("M�quina ganhou com " + this.getMaquina());
			 }
			 else if(this.getMaquina() == 1) { // Maquina = papel
				 return ("Usu�rio ganhou com " + this.getUsuario());
			 }
			 else {
				 return "Empate de " + this.getUsuario(); // Maquina = Tesoura
			 }
			}
		 }
	}
	

