package Atividade3Etapa2;

public class Ingresso {
	
	public double valor;
	
	public Ingresso() {
		
	}
	
	public Ingresso(double valor) {
		this.valor = valor;
	}


	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public String toString() {
		String retorno = "\nO valor do ingresso normal:"+ getValor()+" R$";
		return retorno;
	}
	
	}
