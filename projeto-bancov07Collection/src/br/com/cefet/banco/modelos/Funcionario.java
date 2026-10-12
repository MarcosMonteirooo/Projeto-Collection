package br.com.cefet.banco.modelos;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome) {
		this.setNome(nome);
	}
	
	public abstract double getBonificacao();
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void mostraDados() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Salário: R$"+this.getSalario());
	}

}
