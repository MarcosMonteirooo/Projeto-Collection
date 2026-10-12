package br.com.cefet.banco.modelos;

public class AtualizadorDeContas {
	private double taxaPadrao;
	private double saldoTotal;
	
	public AtualizadorDeContas(double taxaPadrao) {
		this.setTaxaPadrao(taxaPadrao);
	}
	
	public void rodaAtualizacao(Conta c) {
		// aqui vc imprime o saldo atual,
		System.out.println("Saldo atual: R$"+c.getSaldo());
		//atualiza a conta
		c.atualiza(taxaPadrao);
		// e depois imprime o saldo final
		System.out.println("Saldo atualizado: R$"+c.getSaldo());
		// lembrando de somar o saldo final ao atributo saldoTotal
		this.saldoTotal += c.getSaldo();
	}
	
	public void setTaxaPadrao(double taxaPadrao) {
		//Pode haver regras
		this.taxaPadrao = taxaPadrao;
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
	public double getTaxaPadrao() {
		return this.taxaPadrao;
	}
}
