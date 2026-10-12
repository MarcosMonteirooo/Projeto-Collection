package br.com.cefet.banco.modelos;

public class ValorInvalidoParaDepositoException extends RuntimeException {
	public ValorInvalidoParaDepositoException(String msg) {
		super(msg);
	}
}
