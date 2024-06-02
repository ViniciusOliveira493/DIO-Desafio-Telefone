package desafioTelefone;

import desafioTelefone.Model.Browser;
import desafioTelefone.Model.Celular;
import desafioTelefone.Model.Telefone;
import desafioTelefone.Model.TocadorDeMusicas;

public class App {
	public static void main(String[] args) {
		Browser browser = new Browser();
		Telefone fone = new Telefone("11 1111-2222");
		TocadorDeMusicas tdm = new TocadorDeMusicas();
		
		Celular c = new Celular(fone, tdm, browser);
		
		//------------- Ouvindo uma Música -------------
		c.getTocadorDeMusicas().selecionarMusica("ABC");
		c.getTocadorDeMusicas().tocar();
		c.getTocadorDeMusicas().pausar();
		c.getTocadorDeMusicas().pausar();
		c.getTocadorDeMusicas().parar();
		System.out.println();
		
		//------------- Usando o Telefone -------------
		c.getTelefone().ligar("11 3333-4444");
		c.getTelefone().atender();
		c.getTelefone().iniciarCorreioDeVoz();
		System.out.println();
		
		//------------- Usando o Browser -------------
		c.getNavegador().exibirPagina("google");
		c.getNavegador().adicionarNovaAba();
		c.getNavegador().exibirPagina("bing");
		c.getNavegador().exibirPagina("telegram web");
		c.getNavegador().atualizarPagina();
	}
}
