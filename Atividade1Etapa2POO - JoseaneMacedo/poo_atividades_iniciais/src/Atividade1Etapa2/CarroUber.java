package Atividade1Etapa2;

public class CarroUber {

	private String modelo,categoria;
	private int ano;
	private float preco;
	private float quilometragem;

	public CarroUber() {
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modeloCarro) {
		modelo = modeloCarro;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoriaCarro) {
		categoria = categoriaCarro;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int anoCarro) {
		ano = anoCarro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(float precoCarro) {
		preco = precoCarro;
	}

	public float getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(float quilometragemCarro) {
		quilometragem = quilometragemCarro;
	}
	public int tempoFabricacao() {
		int tempoUso = 2022 - ano;
		return tempoUso;
	}
	public String fabricacao() {
		if(tempoFabricacao() < 15) 
			return "Pode servir ao UBER";
		else 
			return "Não pode servir ao UBER";
		}
	public String valorCarro() {
		if (preco < 50000)
			return "Carro POPULAR";
		else
			return "Carro de LUXO";
	}
	public String revisaoSUV() {
		if (quilometragem > 30000)
			return "NECESSÁRIO A REALIZAÇÃO DE REVISÃO";
		else 
			return "AINDA NÃO É NECESSÁRIO A REALIZAÇÃO DE REVISÃO";
	}
	}
