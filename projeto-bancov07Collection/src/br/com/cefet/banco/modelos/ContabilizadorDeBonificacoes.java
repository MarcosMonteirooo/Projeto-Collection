package br.com.cefet.banco.modelos;

public class ContabilizadorDeBonificacoes {
	private double totalEmBonificacoes;
	
	public void contabilizaBonificacao(Funcionario f) {
		this.totalEmBonificacoes += f.getBonificacao();
	}

	
	public double getTotalEmBonificacoes() {
		return this.totalEmBonificacoes;
	}
}
