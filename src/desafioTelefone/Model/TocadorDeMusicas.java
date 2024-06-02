package desafioTelefone.Model;

import desafioTelefone.interfaces.ITocadorDeMusicas;

public class TocadorDeMusicas implements ITocadorDeMusicas{
	private String musicaSelecionada;
	private boolean tocando = false;
	
	@Override
	public void tocar() {
		if(musicaSelecionada != null) {
			System.out.println("Tocando a música "+this.musicaSelecionada);
			tocando = true;
		}else {
			System.err.println("Você não selecionou uma música para ser tocada");
		}
	}

	@Override
	public void pausar() {
		if(musicaSelecionada != null && tocando) {
			System.out.println("Você pausou a música");
			tocando = false;
		}else if(musicaSelecionada != null && !tocando){
			System.out.println("Você voltou a ouvir a música "+this.musicaSelecionada);
			tocando = true;
		}else {
			System.out.println("Você não está ouvindo uma música agora");
		}
		
	}

	@Override
	public void selecionarMusica(String nomeMusica) {
		this.musicaSelecionada = nomeMusica;
		tocando = false;		
	}

	@Override
	public void parar() {
		this.musicaSelecionada = null;
		this.tocando = false;
		System.out.println("Você parou a música");
	}
	
	public boolean getTocando() {
		return this.tocando;
	}
	
	public String getMusicaSelecionada() {
		return this.musicaSelecionada;
	}

}
