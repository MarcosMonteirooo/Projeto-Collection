package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.ContaCorrente;
import br.com.cefet.banco.modelos.DenominadorInvalidoException;
import br.com.cefet.banco.modelos.SaldoInsuficienteException;
import br.com.cefet.banco.modelos.ValorInvalidoParaDepositoException;

public class TestaExcecoes9 {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicio do método1");
		try {
			metodo2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Você extrapolou os limites do array. Erro: "+e.getMessage());
			e.printStackTrace();
		}catch (DenominadorInvalidoException e) {
			System.out.println(e.getMessage());
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim do método1");
	}

	private static void metodo2() {
		System.out.println("Inicio do método2");
		
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}

		int numerador = 4;
		int denominador = 2;
		if(denominador == 0 )
			throw new DenominadorInvalidoException("O denominador não pode ser zero.");
		double resultado = numerador / denominador;
		System.out.println("O resultado é " + resultado);

		ContaCorrente cc = new ContaCorrente(5);
		if(cc == null)
			throw new NullPointerException("Você não pode acessar uma referência nula");
		try {
			cc.deposita(500);
			cc.saca(1001);
		} catch(ValorInvalidoParaDepositoException e) {
			System.out.println(e.getMessage());
		}catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		

		System.out.println("Fim do método2");
	}

}
