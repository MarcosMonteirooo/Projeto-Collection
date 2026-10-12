package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.Caixa;
import br.com.cefet.banco.modelos.Funcionario;
import br.com.cefet.banco.modelos.Gerente;

public class TestaFuncionarios {
	public static void main(String[] args) {
		Caixa f1 = new Caixa("Marcolino");
		f1.setSalario(3000);

		Gerente g2 = new Gerente("Rebeca");
		g2.setNome("Rebeca Azevedo");
		g2.setSalario(6000);
		
		Gerente g3 = new Gerente("Mathews");
		g3.setSalario(6000);
		
		Caixa c1 = new Caixa("Rafael");
		c1.setSalario(3000);

		System.out.println("Funcionário f1:");
		f1.mostraDados();
		System.out.println("Bonificação: R$" + f1.getBonificacao());
		System.out.println("Gerente g2:");
		g2.mostraDados();
		System.out.println("Bonificação: R$" + g2.getBonificacao());
		System.out.println("Gerente g3:");
		g3.mostraDados();
		System.out.println("Bonificação: R$" + g3.getBonificacao());
		System.out.println("Caixa c1:");
		c1.mostraDados();
		System.out.println("Bonificação: R$" + c1.getBonificacao());
	}
}
