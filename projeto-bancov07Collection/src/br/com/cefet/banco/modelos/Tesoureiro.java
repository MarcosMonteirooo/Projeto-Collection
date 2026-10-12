package br.com.cefet.banco.modelos;

public class Tesoureiro extends Funcionario implements Autenticavel{
	protected int senha;
	
	public int getSenha() {
		return this.senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	public Tesoureiro(String nome) {
		super(nome);
	}

	@Override
	public double getBonificacao() {
		return super.salario * 0.2;
	}

	@Override
	public boolean autentica(int senha) {
		return (this.senha == senha);
	}
}
