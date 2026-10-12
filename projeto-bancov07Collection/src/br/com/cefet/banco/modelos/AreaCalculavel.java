package br.com.cefet.banco.modelos;

public interface AreaCalculavel {
	double calcularArea();
	
	void imprimirArea();
	
	default void imprimirAreaDefault() {
		System.out.println(calcularArea());
	}
	
}
