package Atividade2Etapa2;

public class Contato {
	private String nome;
	private String numCelular;
	private String endereco;


	public Contato() {
		
	}
	
	public Contato(String novoNome, String novoNumCelular) {
	    this.setNome(novoNome);
	    this.setNumCelular(novoNumCelular);
	    this.setEndereco(" ");
	    
	  }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String toString(){
	    String retorno = "Nome:" + getNome();
	    if (!getNumCelular().equals(""))
			retorno += "\nNúmero do Celular: " + getNumCelular();
		if (!getEndereco().equals(""))
			retorno += "\nEndereço: " + getEndereco();
		return retorno;
	  }
	public boolean equals(Contato c) {
		
		if (getNome().equals(c.getNome()) && getEndereco().equals(c.getEndereco()))
			return true;
		else
			return false;
	}

	
}
