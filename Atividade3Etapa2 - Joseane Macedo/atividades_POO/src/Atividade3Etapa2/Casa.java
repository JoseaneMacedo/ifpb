package Atividade3Etapa2;

public class Casa extends Imovel{
	
	public String numGaragens;
	public String numPavimentos;

	
	public String getNumGaragens() {
		return numGaragens;
	}
	public void setNumGaragens(String numGaragens) {
		this.numGaragens = numGaragens;
	}
	public String getNumPavimentos() {
		return numPavimentos;
	}
	public void setNumPavimentos(String numPavimentos) {
		this.numPavimentos = numPavimentos;
	}
	public String toStringCasa() {
		String retorno = "Número(s) de garagem(ns): " + getNumGaragens();
//				"\n\nEndereço " +getEndereco()+ "\nNúmero: "+getCodigo()+
//				"\nValor: "+ getValor();
//		if (!getTamanho().equals(""))
//			retorno += "\nTamanho: " + getTamanho();
//		if (!getNumGaragens().equals(""));
//			retorno += "\nNúmero(s) de garagem(ns): " + getNumGaragens();
		if (!getNumPavimentos().equals(""));
			retorno += "\nNúmero(s) de pavimento(s): " + getNumPavimentos();
			return retorno;
	}

}
