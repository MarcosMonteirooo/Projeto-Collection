package br.com.cefet.banco.modelos;

public abstract class Conta {
	protected int numero;//Principio da imutabilidade
	protected Cliente titular; //Imutável
	protected double saldo; //= 500;
	
	//Construtor encapsulado
	private Conta() {
		this.titular = new Cliente();
		this.saldo = 500;
	}
	public Conta(int numero) {
		this();//Invocação de um construtor deve ser a 1ª linha
		this.setNumero(numero);
	}
	
	public Conta(int numero, String nomeDoTitular) {
		this(numero);//Invocação de um construtor deve ser a 1ª linha
		this.getTitular().setNome(nomeDoTitular);
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void atualiza(double taxa) {
		this.saldo -= taxa;
	}

	//método encapsulado
	private void setNumero(int numero) {
		if(numero<=0) {
			System.out.println("Valor inválido para numero de conta.Aplicação será encerrada.");
			System.exit(0);
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if( valor <=0 || valor > this.saldo)
			throw new SaldoInsuficienteException("Valor maior do que o saldo em conta.");
		//Não precisa de else
		this.saldo -= valor;
	}
	
	public void deposita(double valor) throws ValorInvalidoParaDepositoException{
		if( valor <= 0 )
			throw new ValorInvalidoParaDepositoException("Valor inválido para depósito. ");
		this.saldo += valor;
	}
	
	public void transferePara(Conta contaDestino, double valor) throws ValorInvalidoParaDepositoException, SaldoInsuficienteException{
		this.saca(valor);
		contaDestino.deposita(valor);
	}
	
	public void mostraDados() {
		System.out.println("Número: "+this.numero);
		System.out.println("Dados do titular: ");
		this.titular.mostraDados();
		System.out.println("Saldo: R$"+this.saldo);
		
	}
}
