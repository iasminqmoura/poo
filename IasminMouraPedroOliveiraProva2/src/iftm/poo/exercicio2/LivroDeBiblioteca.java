package iftm.poo.exercicio2;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{

	private boolean statusEmprestimo;
	private String localizacao;
	private String descricao;
	
	public LivroDeBiblioteca() {}
	public LivroDeBiblioteca(String titulo, String autor, int numeroPaginas, int anoEdicao
			,boolean statusEmprestimo, String localizacao, String descricao) {
		super(titulo, autor, numeroPaginas, anoEdicao);
		this.statusEmprestimo = statusEmprestimo;
		this.localizacao = localizacao;
		this.descricao = descricao;
		
	}
	public boolean isStatusEmprestimo() {
		return statusEmprestimo;
	}

	public void setStatusEmprestimo(boolean statusEmprestimo) {
		this.statusEmprestimo = statusEmprestimo;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public boolean isEmprestado() {
		// TODO Auto-generated method stub
		return isStatusEmprestimo();
	}

	@Override
	public void empresta() throws Exception{
		if(isStatusEmprestimo() == false) {
			setStatusEmprestimo(true);
		}
		else {
			Exception erro = new Exception();
			throw erro;
		}
	}

	@Override
	public void devolve() throws Exception{
		if(isStatusEmprestimo() == true) {
			setStatusEmprestimo(false);
		}
		else {
			Exception erro = new Exception();
			throw erro;
		}
	}

	@Override
	public String localiza() {
		// TODO Auto-generated method stub
		return this.getLocalizacao();
	}

	@Override
	public String apresentaDescricao() {
		// TODO Auto-generated method stub
		return this.getDescricao();
	}

	public String toString() {
		return "Livro de Biblioteca";
	}
}
