package br.com.cefet.banco.modelos;

public class Circulo implements AreaCalculavel {
	private double raio;

	public Circulo(double raio) {
		this.setRaio(raio);
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * this.raio;
	}

	@Override
	public void imprimirArea() {
		System.out.println(this.calcularArea());
	}
}
