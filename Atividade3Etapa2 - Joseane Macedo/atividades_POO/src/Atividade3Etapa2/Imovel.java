package Atividade3Etapa2;

public class Imovel {
	public String codigo;
	public String tamanho;
	public double valor;
	public String endereco;

	

	public Imovel() {
	
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		String retorno = "\n\nEndereço: " +getEndereco()+ "\nNúmero: "+getCodigo()+
				"\nValor: "+ getValor();
		if (!getTamanho().equals(""))
			retorno += "\nTamanho: " + getTamanho();
		
			return retorno;
		
	}



}
