package br.com.cefet.banco.testes;

import java.io.FileNotFoundException;

import br.com.cefet.banco.modelos.ContaCorrente;


public class TestaExcecoes10 {

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

	private static void metodo2()  {
		System.out.println("Inicio do método2");
		
		ContaCorrente cc = new ContaCorrente(5);
		cc.deposita(500);
		cc.saca(100);
		
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			//e.printStackTrace();
		}
		
		ContaCorrente cc2 = new ContaCorrente(6);
		cc.transferePara(cc2, 500);
		
		cc.mostraDados();
		System.out.println("###############################################");
		cc2.mostraDados();

		System.out.println("Fim do método2");
	}

}
