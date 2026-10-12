package br.com.cefet.banco.modelos;

public class DenominadorInvalidoException extends RuntimeException{
	public DenominadorInvalidoException(String msg) {
		super(msg);
	}
}
