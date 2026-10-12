package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.AreaCalculavel;
import br.com.cefet.banco.modelos.Retangulo;

public class TestaFiguras {

	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calcularArea());
	}

}
