package br.com.cefet.banco.testes;

public class TestaExcecoes1 {

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
		for (int i = 0; i < 5; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		
		System.out.println("Fim do método2");
	}

}
