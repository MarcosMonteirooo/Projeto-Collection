package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.ContaCorrente;

public class TestaExcecoes3 {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicio do método1");
		metodo2();
		System.out.println("Fim do método1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio do método2");
		int[] array = new int[5];
		try {
			for (int i = 0; i < 6; i++) {
				array[i] = i;
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Você extrapolou os limites do array. "+e.getMessage());
		}
		
		int numerador = 4;
		int denominador = 2;
		double resultado = numerador/denominador;
		System.out.println("O resultado é "+resultado);
		
		ContaCorrente cc = null;
		//cc.deposita(500);
		
		System.out.println("Fim do método2");
	}

}
