package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.AtualizadorDeContas;
import br.com.cefet.banco.modelos.Conta;
import br.com.cefet.banco.modelos.ContaCorrente;
import br.com.cefet.banco.modelos.ContaPoupanca;

public class TestaAtualizadorDeContas {
	public static void main(String[] args) {
		Conta c = new ContaCorrente(1);
		Conta cc = new ContaCorrente(2);
		Conta cp = new ContaPoupanca(3);
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		AtualizadorDeContas atualizador = new AtualizadorDeContas(0.01);
		
		atualizador.rodaAtualizacao(c);
		atualizador.rodaAtualizacao(cc);
		atualizador.rodaAtualizacao(cp);
		
		System.out.println("Saldo total: R$"+atualizador.getSaldoTotal());
	}
}
