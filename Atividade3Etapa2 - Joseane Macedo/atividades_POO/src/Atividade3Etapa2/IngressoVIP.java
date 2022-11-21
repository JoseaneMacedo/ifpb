package Atividade3Etapa2;

public class IngressoVIP extends Ingresso {
	public double valorAdicional;

	
	public IngressoVIP() {
		
	}
	public IngressoVIP(double valor,double valorAdicional ) {
		super();
		this.valor = valor;
		this.valorAdicional = valorAdicional;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public double calcularIngressoVIP() {
		return (this.getValor() + getValorAdicional());
	}
	public String toStringIngressoVip() {
		
		String retorno = "\nPara o INGRESSO VIP há um adicional de "+ getValorAdicional()+ "R$"
				+ "\nTotalizando:"+ calcularIngressoVIP() +" R$";
		return retorno;
	}

	

}
