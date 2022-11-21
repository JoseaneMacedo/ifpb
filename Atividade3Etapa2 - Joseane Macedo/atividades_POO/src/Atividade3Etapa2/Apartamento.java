package Atividade3Etapa2;

public class Apartamento extends Imovel {
	public String andar;

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}
	public String toStringApartamento() {
		String retorno = "Andar: " + getAndar();
		return retorno;
//		String retorno = "\n\nEndereço: " +getEndereco()+ "\nNúmero: "+getCodigo()+
//				"\nValor: "+ getValor();
//		if (!getTamanho().equals(""))
//			retorno += "\nTamanho: " + getTamanho();
//		if (!getAndar().equals(""))
//			retorno += "\nAndar: " + getAndar();
//			return retorno;
		
	}
}
