package Atividade3Etapa2;

public class Ave extends Animal {
	
	public String tempoVoo;

	public String getTempoVoo() {
		return tempoVoo;
	}

	public void setTempoVoo(String tempoVoo) {
		this.tempoVoo = tempoVoo;
	}
	
	public String toStringAve() {
		String retorno = "\nTempo Aproximado de voo: " +getTempoVoo();
		return retorno;
	}
}

