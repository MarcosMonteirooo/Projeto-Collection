package br.com.cefet.banco.modelos;

public interface Autenticavel {
	boolean autentica(int senha);
	
	default void digaOi() {
		System.out.println("Oi");
	}
}
