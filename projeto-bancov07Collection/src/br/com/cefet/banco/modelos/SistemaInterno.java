package br.com.cefet.banco.modelos;

public class SistemaInterno {
	private int senhaSistema;
	public SistemaInterno(int senhaSistema) {
		this.setSenhaSistema(senhaSistema);
	}
	
	public void login(Autenticavel a) {
		if(a.autentica(this.senhaSistema))
			System.out.println("Acesso liberado!");
		else
			System.out.println("Acesso negado");
	}
	
	public void setSenhaSistema(int senhaSistema) {
		//Pode haver regras
		this.senhaSistema = senhaSistema;
	}
}
