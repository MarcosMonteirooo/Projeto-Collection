package br.com.cefet.banco.modelos;

public class Caixa extends Funcionario{
	public Caixa(String nome) {
		super(nome);
	}

	private int numDoGuiche;

	public int getNumDoGuiche() {
		return this.numDoGuiche;
	}

	public void setNumDoGuiche(int numDoGuiche) {
		this.numDoGuiche = numDoGuiche;
	}

	@Override
	public double getBonificacao() {
		return super.salario * 0.15;
	}
	

	
}
