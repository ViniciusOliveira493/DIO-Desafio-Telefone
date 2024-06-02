package desafioTelefone.Model;

import desafioTelefone.interfaces.IBrowser;
import desafioTelefone.interfaces.ITelefone;
import desafioTelefone.interfaces.ITocadorDeMusicas;

public class Celular {
	private ITelefone telefone;
	private ITocadorDeMusicas mPlayer;
	private IBrowser navegador;
	
	public Celular(ITelefone telefone,ITocadorDeMusicas musicPlayer,IBrowser browser) {
		this.telefone = telefone;
		this.mPlayer = musicPlayer;
		this.navegador = browser;
	}

	public ITelefone getTelefone() {
		return telefone;
	}

	public void setTelefone(ITelefone telefone) {
		this.telefone = telefone;
	}

	public ITocadorDeMusicas getTocadorDeMusicas() {
		return mPlayer;
	}

	public void setTocadorDeMusicas(ITocadorDeMusicas mPlayer) {
		this.mPlayer = mPlayer;
	}

	public IBrowser getNavegador() {
		return navegador;
	}

	public void setNavegador(IBrowser navegador) {
		this.navegador = navegador;
	}
}
