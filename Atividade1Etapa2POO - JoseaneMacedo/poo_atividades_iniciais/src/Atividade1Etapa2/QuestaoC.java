package Atividade1Etapa2;

import java.util.Scanner;

public class QuestaoC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Scanner entrada1 = new Scanner (System.in);
		
		int numeroDaConta;
		String nome, saldo;
		double valorSaldo;
		
		System.out.print("Agora, o número da conta sem dígito: ");
		numeroDaConta= entrada.nextInt();
		System.out.print("Digite o nome do cliente: ");
		nome = entrada1.nextLine();
		System.out.print("\nPara o saldo positivo, ex.123,34; e  "
				+ "\nPara saldo negativo, ex. -123,44."
				+ "Agora, o saldo atual do cliente:");
		valorSaldo= entrada.nextDouble();
		
		ClienteBanco a = new ClienteBanco();
		
		a.setNumeroConta(numeroDaConta);
		a.setNomeCliente(nome);
		a.setSaldo(valorSaldo);
		
		
		saldo = a.resultadoSaldo();

		
		System.out.print("\n\nCOOPERATIVA AURORA"
				+ "\n-----------------------------"
				+ "\nDados do cliente"
				+ "\n-----------------------------");
		
		System.out.printf("%n%n%n-Número da conta: %s%n-Cliente: %s%n- %s%n", 
				a.getNumeroConta(), a.getNomeCliente(), saldo);
				 
		
		
		entrada.close();
		entrada1.close();

	}

}
