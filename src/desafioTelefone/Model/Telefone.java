package desafioTelefone.Model;

import desafioTelefone.interfaces.ITelefone;

public class Telefone implements ITelefone {
	private String meuNumero = "";
	
	public Telefone(String meuNumero) {
		this.meuNumero = meuNumero;
	}
	
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para "+ numero + " com o número "+this.meuNumero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação recebida em "+this.meuNumero);
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz com o número "+this.meuNumero);
		
	}

}
