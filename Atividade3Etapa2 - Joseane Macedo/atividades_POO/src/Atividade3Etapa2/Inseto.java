package Atividade3Etapa2;


public class Inseto extends Animal {
	public String numPatas, numAntenas;

	public String getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(String numPatas) {
		this.numPatas = numPatas;
	}

	public String getNumAntenas() {
		return numAntenas;
	}

	public void setNumAntenas(String numAntenas) {
		this.numAntenas = numAntenas;
	}
	public String toStringInseto() {
		String retorno = "\nOs insetos têm um par de ANTENAS  e 6 patas";
		if (!getNumPatas().equals(""))
			retorno += "\nNúmero de patas: " + getNumAntenas();
		if(!getNumAntenas().equals(""))
			retorno += "\nNúmero de antenas: " + getNumAntenas();
			return retorno;
	}
}
