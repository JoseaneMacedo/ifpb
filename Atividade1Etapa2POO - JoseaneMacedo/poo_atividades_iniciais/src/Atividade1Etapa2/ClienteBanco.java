package Atividade1Etapa2;

public class ClienteBanco {

	private int numeroConta;
	private String nomeCliente;
	private double saldo;
	
	public ClienteBanco() {

	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int num_Conta) {
		numeroConta = num_Conta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String n_Cliente) {
		nomeCliente = n_Cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldoConta) {
		saldo = saldoConta;
	}
	
	public String resultadoSaldo() {
		if (saldo > 0) 
			return "Saldo POSITIVO:\n-Opção 1:SAQUE\n-Opção 2:DEPÓSITO";
	
		else 
			return "Saldo NEGATICO;\n-Opção 2:DEPÓSITO";
	}
}
