package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.Circulo;
import br.com.cefet.banco.modelos.MostradorDeArea;
import br.com.cefet.banco.modelos.Quadrado;
import br.com.cefet.banco.modelos.Retangulo;

public class TestaMostrador {

	public static void main(String[] args) {
		MostradorDeArea mostrador = new MostradorDeArea();
		
		Retangulo ret = new Retangulo(2, 3);
		Quadrado quad = new Quadrado(10);
		Circulo circ = new Circulo(7.5);
		
		mostrador.mostra(ret);
		mostrador.mostra(quad);
		mostrador.mostra(circ);

	}

}
