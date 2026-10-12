package br.com.cefet.banco.modelos;

public class ContaCorrente extends Conta{
	public ContaCorrente(int numero) {
		super(numero);
	}
	
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa * 2);
	}
	
	@Override
	public void deposita(double valor) throws ValorInvalidoParaDepositoException{
		super.deposita(valor - 0.10);
	}
}
