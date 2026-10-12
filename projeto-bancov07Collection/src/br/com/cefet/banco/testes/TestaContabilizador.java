package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.Caixa;
import br.com.cefet.banco.modelos.ContabilizadorDeBonificacoes;
import br.com.cefet.banco.modelos.Diretor;
import br.com.cefet.banco.modelos.Funcionario;
import br.com.cefet.banco.modelos.Gerente;
import br.com.cefet.banco.modelos.Secretario;
import br.com.cefet.banco.modelos.Tesoureiro;

public class TestaContabilizador {
	public static void main(String[] args) {
		ContabilizadorDeBonificacoes contabilizador = new ContabilizadorDeBonificacoes();
		
		//Funcionario f1 = new Funcionario("Marcolino");
		//f1.setSalario(3000);

		Gerente g2 = new Gerente("Rebeca");
		g2.setNome("Rebeca Azevedo");
		g2.setSalario(6000);
		
		Gerente g3 = new Gerente("Mathews");
		g3.setSalario(6000);
		
		Caixa c1 = new Caixa("Rafael");
		c1.setSalario(3000);
		
		Tesoureiro t1 = new Tesoureiro("Gustavo");
		t1.setSalario(4000);
		
		Diretor d1 = new Diretor("Salvador");
		d1.setSalario(8000);
		
		Secretario s1 = new Secretario("Marcos");
		s1.setSalario(3500);
		
		
		/*contabilizador.contabilizaBonificacao(g2);
		contabilizador.contabilizaBonificacao(g3);
		contabilizador.contabilizaBonificacao(d1);
		contabilizador.contabilizaBonificacao(c1);
		contabilizador.contabilizaBonificacao(t1);*/


		/*Funcionario[] funcionarios = new Funcionario[5];
		funcionarios[0] = g2;
		//....*/
		Funcionario[] funcionarios = {g2, g3, d1, c1, t1};
		for (Funcionario f : funcionarios) {
			if(f!=null)
				contabilizador.contabilizaBonificacao(f);
		}
		System.out.println("Total em bonificações: "+contabilizador.getTotalEmBonificacoes());
	}
}
