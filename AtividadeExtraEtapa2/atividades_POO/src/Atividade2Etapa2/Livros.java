package Atividade2Etapa2;

public class Livros {
	private String nome, 
	autor, 
	ISBN;
	private String edicao;


	public Livros() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String toString(){
	    String retorno = "\n\nNome do Livro:" + getNome() + "\nAutor: " + getAutor();
	    if (!getISBN().equals(""))
	    	retorno += "\nISBN: "+ getISBN();
	    if (!getEdicao().equals(" "))
	    	retorno += "\nEdição: "+ getEdicao();
	    return retorno;
	}
		
	public boolean equals(Livros l) {
		if (getISBN().equals(l.getISBN()))
			return true;
		else
			return false;
	}
		

}


