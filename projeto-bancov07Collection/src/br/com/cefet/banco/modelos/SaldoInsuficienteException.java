package br.com.cefet.banco.modelos;

public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
