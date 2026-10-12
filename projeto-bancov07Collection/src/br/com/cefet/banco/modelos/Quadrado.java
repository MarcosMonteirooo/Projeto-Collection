package br.com.cefet.banco.modelos;

public class Quadrado implements AreaCalculavel{
	private int lado;
	
	public Quadrado(int lado) {
		this.setLado(lado);
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
	
	@Override
	public void imprimirArea() {
		System.out.println(this.calcularArea());
	}
}
