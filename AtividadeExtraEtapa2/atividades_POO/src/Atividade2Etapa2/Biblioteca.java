package Atividade2Etapa2;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
	public String nome, endereco,CNPJ;
	List<Livros> biblioteca = new ArrayList<Livros>(10);
	
	public Biblioteca() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}
	public boolean equals(Biblioteca b) {
		if(getCNPJ().equals(b.getCNPJ()))
			return true;
		else
			return false;
	}

	public void ExibirBibioteca() {
		System.out.printf("%nNome: %s%nCNPJ: %s%nEndereço: %s ",getNome(),getCNPJ(), getEndereco());
	}
	
	public void Adicionar(Livros l) {
		biblioteca.add(l);
	}
	public void Exibir() {
		System.out.println("\n\nAcervo:" + biblioteca.toString());
		
	}
}
