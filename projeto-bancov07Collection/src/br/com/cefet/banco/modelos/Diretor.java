package br.com.cefet.banco.modelos;

public final class Diretor extends Gerente {
	public Diretor(String nome) {
		super(nome);
	}

	@Override
	public final double getBonificacao() {
		return super.salario * 0.5;
	}
}
