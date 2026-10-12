package br.com.cefet.banco.modelos;

public class Gerente extends Funcionario implements Autenticavel{
	protected int senha;
	public int getSenha() {
		return this.senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public Gerente(String nome) {
		super(nome);
	}

	
	@Override
	public boolean autentica(int senha) {
		return (this.senha == senha);
	}
	
	public final boolean autentica(String login, int senha) {
		return (this.senha == senha && login =="CEFET");
	}
	
	@Override
	public double getBonificacao() {
		return super.salario * 0.3;
	}
	
	
}
