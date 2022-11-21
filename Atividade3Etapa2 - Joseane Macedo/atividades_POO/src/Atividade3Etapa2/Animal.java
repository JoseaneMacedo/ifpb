package Atividade3Etapa2;

public class Animal {
	
	public String nome, familia, altura, peso;

	public Animal() {
	
	}
	
	 public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String toStringAnimal() {
		String retorno = "\n\nNome: " +getNome()+ "\nFamília: "+getFamilia();
		if (!getAltura().equals(""))
			retorno += "\nAltura: " + getAltura();
		
			return retorno;
		
	}

	}
	
