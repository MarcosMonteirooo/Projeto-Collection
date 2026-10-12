package br.com.cefet.banco.modelos;

public class Retangulo implements AreaCalculavel {
	private int largura, altura;

	public Retangulo(int largura, int altura) {
		this.setAltura(altura);
		this.setLargura(largura);
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	@Override
	public double calcularArea() {
		return this.altura * this.largura;
	}
	
	@Override
	public void imprimirArea() {
		System.out.println(this.calcularArea());
	}
}
