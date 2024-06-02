package desafioTelefone.Model;

import desafioTelefone.interfaces.IBrowser;

public class Browser implements IBrowser {
	private String paginaAtual;
	private int abasAbertas = 1;
	
	@Override
	public void exibirPagina(String nome) {
		this.paginaAtual = nome;
		if(abasAbertas==1) {
			System.out.println("Você acessou a página "+ this.paginaAtual);
		}else {
			System.out.println("Você acessou a página "+ this.paginaAtual 
					+ " na aba "+this.abasAbertas);
		}
	}

	@Override
	public void adicionarNovaAba() {
		this.abasAbertas++;
		System.out.println("Você abriu uma nova aba.\nVocê tem "+this.abasAbertas+" abas abertas");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("A página foi atualizada");
	}

}
