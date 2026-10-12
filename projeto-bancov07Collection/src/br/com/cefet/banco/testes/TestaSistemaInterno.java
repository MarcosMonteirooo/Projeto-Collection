package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.Cliente;
import br.com.cefet.banco.modelos.Diretor;
import br.com.cefet.banco.modelos.Gerente;
import br.com.cefet.banco.modelos.SistemaInterno;
import br.com.cefet.banco.modelos.Tesoureiro;

public class TestaSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno(123);
		
		Gerente g2 = new Gerente("Thiago");
		g2.setSenha(124);
		Gerente g3 = new Gerente("Mathews");
		g3.setSenha(123);
		Diretor d1 = new Diretor("Gregory");
		d1.setSenha(123);
		
		Tesoureiro t1 = new Tesoureiro("Ana Yukari");
		t1.setSenha(123);
		Cliente c1 = new Cliente("Liliane");
		c1.setSenha(1215);
		
		g2.digaOi();
		c1.digaOi();
			
		sistema.login(g2);
		sistema.login(g3);
		sistema.login(d1);
		sistema.login(c1);
		sistema.login(t1);
	}
}
