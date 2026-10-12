package br.com.cefet.banco.modelos;

public abstract class FuncionarioAutenticavel extends Funcionario{
	public FuncionarioAutenticavel(String nome) {
		super(nome);
	}

	protected int senha;

	public int getSenha() {
		return this.senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		return (this.senha == senha);
	}
	
	public final boolean autentica(String login, int senha) {
		return (this.senha == senha && login =="CEFET");
	}
}
