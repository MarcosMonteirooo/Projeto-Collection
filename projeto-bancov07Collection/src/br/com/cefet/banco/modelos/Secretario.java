package br.com.cefet.banco.modelos;

public class Secretario extends Funcionario{

	public Secretario(String nome) {
		super(nome);
	}
	
	@Override
	public double getBonificacao() {
		return super.salario * 0.18;
	}

}
