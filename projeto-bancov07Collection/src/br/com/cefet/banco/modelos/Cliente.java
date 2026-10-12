package br.com.cefet.banco.modelos;

public class Cliente implements Autenticavel{
	private String nome;
	private String cpf;
	private String email;
	private int senha;
	public int getSenha() {
		return this.senha;
	}
	
	@Override
	public void digaOi() {
		System.out.println("Oi. Sou um cliente.");
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public Cliente() {
		;//Supondo que há uma regra
	}
	
	@Override
	public boolean autentica(int senha) {
		return (this.senha == senha);
	}
	
	public Cliente(String nome) {
		this();
		this.setNome(nome);
	}
	
	public Cliente(String nome, String cpf) {
		this(nome);
		this.setCpf(cpf);
	}
	
	public Cliente(String nome, String cpf, String email) {
		this(nome, cpf);
		this.setEmail(email);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if(nome.length()>=3)
			this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	//Método encapsulado
	private boolean validaCpf(String cpf) {
		return (cpf.length()==11);
	}

	public void setCpf(String cpf) {
		if(this.validaCpf(cpf))
			this.cpf = cpf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void mostraDados() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Cpf: "+this.cpf);
		System.out.println("E-mail: "+this.getEmail());
	}



}
