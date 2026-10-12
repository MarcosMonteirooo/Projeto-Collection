package br.com.cefet.banco.testes;

public class OperacoesMatematicas {
	public int soma(int num1, int num2) {
		return num1+num2;
	}
	public int soma(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public double soma(double num1, double num2) {
		return num1+num2;
	}
	public int soma(int... numeros) {
		int soma = 0;
		for(int i=0;i<numeros.length;i++)
			soma+=numeros[i];
		return soma;
	}
	
	public static void main(String[] args) {
		OperacoesMatematicas op = new OperacoesMatematicas();
		System.out.println(op.soma(10,20,30,40));
		System.out.println(op.soma(2,2));
		System.out.println(op.soma(2,2,2));
		System.out.println(op.soma(2.0,2.0));
		System.out.println(op.soma(10,20));
	}
}

